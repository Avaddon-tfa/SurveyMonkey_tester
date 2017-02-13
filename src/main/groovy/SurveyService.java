import domain.Constants;

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

        String url = "https://api.surveymonkey.net/v3/surveys/" + id + "/responses?api_key=" + key;

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

    List<List<String>> responseProcessor (List<List<String>> allDetailedResponses, Map<String, String> surveyKeys) {

        Map<String, Integer> responseCounter = new HashMap<>();

        for (List<String> response: allDetailedResponses) {

            for (String choice_id: response) {
                if (choice_id != null) {
                    if (responseCounter.containsKey(choice_id)) {
                        Integer n = responseCounter.get(choice_id) + 1;
                        responseCounter.put(choice_id, n);
                    }
                    else {
                    responseCounter.put(choice_id, 0);}
                }
            }

            //System.out.println(responseCounter);
        }

        Map<String, Integer> treeMap = new TreeMap<>(responseCounter);


        Iterator<Map.Entry<String, Integer>> entries = treeMap.entrySet().iterator();
        while (entries.hasNext()) {

            Map.Entry<String, Integer> entry = entries.next();
            System.out.println((surveyKeys.get(entry.getKey()) + " : " + entry.getValue()));
        }

        return allDetailedResponses;
    }
}