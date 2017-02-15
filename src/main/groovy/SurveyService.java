import domain.Choice;
import domain.Constants;
import domain.Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

//Это порт API SurveyMonkey под Java.
//JSON возвращается в Unicode

class SurveyService {
    //TODO переписать исключения
    //Метод установки соединения, получает на вход ссылку и токен, возвращает коннекшн, который потом мы отдаем в чтение.
    private URLConnection establishConnection(String url, String token) throws Exception {

        URL readUrl = new URL(url);
        URLConnection connection = readUrl.openConnection();
        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.connect();

        return connection;
    }

    //Возвращает список имеющихся исследований в формате JSON
    String getSurveyList(String token, String key) {
        try {
            String url = "https://api.surveymonkey.net/v3/surveys?per_page=150&api_key=" + key;

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    establishConnection(url, token).getInputStream()));
            return in.readLine() + "\n";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    //Возвращает данные одного исследования в формате JSON
    String getSurvey(String id, String token, String key) throws Exception {

        String url = "https://api.surveymonkey.net/v3/surveys/" + id + "?api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                establishConnection(url, token).getInputStream()));
        return in.readLine() + "\n";
    }

    //v3/surveys/{survey_id}/details
    String getSurveyDetails(String id, String token, String key) throws Exception {

        String url = "https://api.surveymonkey.net/v3/surveys/" + id + "/details?api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                establishConnection(url, token).getInputStream()));

        return in.readLine() + "\n";
    }

    //Возвращает данные об ответах в исследовнии в формате JSON, из этого метода собираем ID всех ответов
    // при помощи JsonWorker.getResponseIDs()
    private String getResponseList(String id, String token, String key) throws Exception {

        String url = "https://api.surveymonkey.net/v3/surveys/" + id + "/responses?page=1&per_page=900&api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                establishConnection(url, token).getInputStream()));

        return in.readLine() + "\n";
    }

    //Отдает массив ID всех ответов всех респондентов
    List<List<String>> getAllDetailedResponses(String id, String token, String key) throws Exception {

        List<List<String>> allDetailedResponses = new ArrayList<>();

        for (String responseID : JsonWorker.parseResponseIDs(getResponseList(id, Constants.token, Constants.apiKey))) {
            ///TODO rename to const
            String url = "https://api.surveymonkey.net/v3/surveys/" + id + "/responses/" + responseID + "/details?api_key=" + key;

            BufferedReader in = new BufferedReader(new InputStreamReader(establishConnection(url, token).getInputStream()));
            allDetailedResponses.add(JsonWorker.parseResponse(in.readLine()));
        }
        return allDetailedResponses;
    }

    Map<String, Double> responseProcessor (List<List<String>> allDetailedResponses, List<Question> surveyKeys) {

        HashMap <String, Double> rates = new HashMap<>();
        HashMap <String, Double> counter = new HashMap<>();
        Map <String, Double> finalRating = new TreeMap<>();


        for (Question q: surveyKeys) {
            if (q.getChoices() != null) {
                for (Choice choice: q.getChoices()) {
                    rates.put(choice.getText(), 0.0);
                    counter.put(choice.getText(), 0.0);
                    finalRating.put(choice.getText(), 0.0);
                }
            }
        }

        for (List<String> response: allDetailedResponses) {

            for (String choice_id: response) {

                if (choice_id != null) {
                    //здесь надо взять id следующего ответа из response
                    if (response.indexOf(choice_id) + 1 < response.size()) {
                        String nextId = response.get(response.indexOf(choice_id) + 1);

                        for (Question q : surveyKeys) {

                            if (q.getChoices() != null) {

                                for (Choice choice : q.getChoices()) {

                                    try {

                                        if (choice.getId().equals(choice_id) && surveyKeys.get(surveyKeys.indexOf(q) + 1).getChoices().get(1).getWeight() != null) {

                                            //получаем формулировку вопроса
                                            String choiceText = choice.getText();

                                            //получаем вес ответа на вопрос из Surveykeys
                                            Question nextQuestion = surveyKeys.get(surveyKeys.indexOf(q) + 1);

                                            for (Choice nextChoice : nextQuestion.getChoices()) {
                                                if (nextChoice.getId().equals(nextId)) {

                                                    Long weight = nextChoice.getWeight();

                                                    //System.out.println(choice.getText() + " " + weight);

                                                    //прибавить в темп
                                                    Double temp = (double) rates.get(choiceText) + weight;
                                                    Double numOfEntries = counter.get(choiceText) + 1;

                                                    rates.put(choiceText, temp);
                                                    counter.put(choiceText, numOfEntries);
                                                }
                                            }
                                        }

                                    } catch (NullPointerException e) {
                                        continue;
                                    } catch (IndexOutOfBoundsException e) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //System.out.println(responseCounter);
        }

        Iterator<Map.Entry<String, Double>> entries = finalRating.entrySet().iterator();
        while (entries.hasNext()) {

            Map.Entry<String, Double> entry = entries.next();

            if (counter.get(entry.getKey()) != 0) {

                Double calculatedRate = rates.get(entry.getKey()) / counter.get(entry.getKey());

                entry.setValue(calculatedRate);
            } else entries.remove();
        }

        return finalRating;
    }
}