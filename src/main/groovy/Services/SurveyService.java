package Services;

import domain.Choice;
import domain.Constants;
import domain.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import static domain.Constants.surveyMonkeyUrl;

//Это порт API SurveyMonkey под Java.
//JSON возвращается в Unicode
// 85694193

public class SurveyService {
    //TODO переписать исключения
    //Метод установки соединения, получает на вход ссылку и токен, возвращает коннекшн, который потом мы отдаем в чтение.
    public URLConnection connectionToSurvey(String url, String token) throws Exception {

        URL readUrl = new URL(url);
        URLConnection connection = readUrl.openConnection();
        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.connect();

        return connection;
    }

    //Возвращает список имеющихся исследований в формате JSON
    String getSurveyList(String token, String key) {
        try {
            String url = surveyMonkeyUrl + "?per_page=50&api_key=" + key;

            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        connectionToSurvey(url, token).getInputStream()));
            return in.readLine() + "\n";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    //Возвращает данные одного исследования в формате JSON
    String getSurvey(String id, String token, String key) throws Exception {

        String url = surveyMonkeyUrl + id + "?api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                                        connectionToSurvey(url, token).getInputStream()));
        return in.readLine() + "\n";
    }

    //v3/surveys/{survey_id}/details
    public String getSurveyDetails(String id, String token, String key) {

        String url = surveyMonkeyUrl + id + "/details?api_key=" + key;

        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(
                                            connectionToSurvey(url, token).getInputStream()));
            return in.readLine() + "\n";

        } catch (IOException e) {
            System.out.println("IOException in getSureyDetails method");
        } catch (Exception e) {
            System.out.println("Some Exception in getSureyDetails method");
        }

        return url;
    }

    //Возвращает данные об ответах в исследовнии в формате JSON, из этого метода собираем ID всех ответов
    // при помощи Services.JsonWorker.getResponseIDs()
    public String getResponseList(String id, String token, String key) throws Exception {

        String url = surveyMonkeyUrl + id + "/responses?page=1&per_page=9&api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                                        connectionToSurvey(url, token).getInputStream()));

        return in.readLine() + "\n";
    }

    //Отдает массив ID всех ответов всех респондентов
    public List<List<String>> getAllDetailedResponses(String id, String token, String key) throws Exception {

        List<List<String>> allDetailedResponses = new ArrayList<>();

        for (String responseID : JsonWorker.parseResponseIDs(getResponseList(id, Constants.token, Constants.apiKey))) {

            String url = surveyMonkeyUrl + id + "/responses/" + responseID + "/details?api_key=" + key;

            BufferedReader in = new BufferedReader(new InputStreamReader(connectionToSurvey(url, token).getInputStream()));
            allDetailedResponses.add(JsonWorker.parseResponse(in.readLine()));
        }
        return allDetailedResponses;
    }

    public Map<String, BigDecimal> responseProcessor(List<List<String>> allDetailedResponses, List<Question> surveyKeys) {

        HashMap <String, Double> rates = new HashMap<>();
        HashMap <String, Double> counter = new HashMap<>();
        Map <String, BigDecimal> finalRating = new TreeMap<>();


        surveyKeys.stream().filter(q -> q.getChoices() != null).forEach(q -> {

            if (q.getText().contains("кейноут")) {

                String talk2 = q.getText().replace("<strong>", "");
                String talk1 = talk2.replace("</strong>", "");
                String talk0 = talk1.replace("Оцените кейноут ", "");
                String talk = talk0.replace("<br>", "");
                String keynote = talk.replace("<br />", " — ");

                rates.put(keynote, 0.0);
                counter.put(keynote, 0.0);
                finalRating.put(keynote, BigDecimal.valueOf(0));
            }

            for (Choice choice : q.getChoices()) {

                String talk2 = choice.getText().replace("<strong>", "");
                String talk1 = talk2.replace("</strong>", "");
                String talk = talk1.replace("<br />", " — ");

                rates.put(talk, 0.0);
                counter.put(talk, 0.0);
                finalRating.put(talk, BigDecimal.valueOf(0));

            }
        });

        for (List<String> response: allDetailedResponses) {

            //здесь надо взять id следующего ответа из response
            //получаем формулировку вопроса
            //получаем вес ответа на вопрос из Surveykeys
            response.stream().filter(choice_id -> choice_id != null).filter(choice_id -> response.indexOf(choice_id) + 1 < response.size()).forEach(choice_id -> {
                String nextId = response.get(response.indexOf(choice_id) + 1);

                //получаем формулировку вопроса
                //получаем вес ответа на вопрос из Surveykeys
                //прибавить в темп
                surveyKeys.stream().filter(q -> q.getChoices() != null).forEach(q -> {

                    for (Choice choice : q.getChoices()) {

                        try {

                            boolean choiceFits = choice.getId().equals(choice_id);

                            if (choiceFits && surveyKeys.get(surveyKeys.indexOf(q)).getText().contains("кейноут")) {

                                String talk2 = q.getText().replace("<strong>", "");
                                String talk1 = talk2.replace("</strong>", "");
                                String talk0 = talk1.replace("Оцените кейноут ", "");
                                String talk = talk0.replace("<br>", "");
                                String keynote = talk.replace("<br />", " — ");

                                Long weight = choice.getWeight();

                                if (weight != 0) {
                                    Double temp = (double) rates.get(keynote) + weight;
                                    Double numOfEntries = counter.get(keynote) + 1;

                                    rates.put(keynote, temp);
                                    counter.put(keynote, numOfEntries);
                                }

                            }

                            if (choiceFits && surveyKeys.get(surveyKeys.indexOf(q) + 1).getChoices().get(1).getWeight() != null) {

                                //получаем формулировку вопроса
                                String talk2 = choice.getText().replace("<strong>", "");
                                String talk1 = talk2.replace("</strong>", "");
                                String talk0 = talk1.replace("<br>", "");
                                String talk = talk0.replace("<br />", " — ");

                                //получаем вес ответа на вопрос из Surveykeys
                                Question nextQuestion = surveyKeys.get(surveyKeys.indexOf(q) + 1);

                                for (Choice nextChoice : nextQuestion.getChoices()) {
                                    if (nextChoice.getId().equals(nextId)) {

                                        Long weight = nextChoice.getWeight();

                                        //прибавить в темп
                                        Double temp = (double) rates.get(talk) + weight;
                                        Double numOfEntries = counter.get(talk) + 1;

                                        rates.put(talk, temp);
                                        counter.put(talk, numOfEntries);
                                    }
                                }
                            }

                        } catch (NullPointerException e) {
                            continue;
                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }
                    }
                });
            });
        }

        Iterator<Map.Entry<String, BigDecimal>> entries = finalRating.entrySet().iterator();
        while (entries.hasNext()) {

            Map.Entry<String, BigDecimal> entry = entries.next();

            if (counter.get(entry.getKey()) != 0 && entry.getKey().contains(" / ")) {

                Double temp = rates.get(entry.getKey()) / counter.get(entry.getKey()) / 10;
                BigDecimal calculatedRate = new BigDecimal(temp).setScale(2, BigDecimal.ROUND_HALF_EVEN);

                entry.setValue(calculatedRate);

            } else entries.remove();
        }

        return finalRating;
    }
}