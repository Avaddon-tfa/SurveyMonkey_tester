import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//Это порт API SurveyMonkey под Java.
//JSON возвращается в Unicode

class API_Controller {

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
            String url = "https://api.surveymonkey.net/v3/surveys?api_key=" + key;

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

        String url = "https://api.surveymonkey.net/v3/surveys/"+ id + "?api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                establishConnection(url, token).getInputStream()));
        return in.readLine() + "\n";
    }

    //Возвращает данные об ответах в исследовнии в формате JSON, из этого метода собираем ID всех ответов
    // при помощи JsonWorker.getResponseIDs()
    private String getResponseList(String id, String token, String key) throws Exception {

        String url = "https://api.surveymonkey.net/v3/surveys/"+ id + "/responses?api_key=" + key;

        BufferedReader in = new BufferedReader(new InputStreamReader(
                establishConnection(url, token).getInputStream()));
        return in.readLine() + "\n";
    }

    //Выводит в консоль все ответы респонднта
    void getDetailedResponse(String id, String token, String key) throws Exception {

        for (String responseID: JsonWorker.getResponseIDs(getResponseList(id, CONSTANT.token, CONSTANT.apiKey))) {

            String url = "https://api.surveymonkey.net/v3/surveys/"+ id + "/responses/" + responseID + "/details?api_key=" + key;

            BufferedReader in = new BufferedReader(new InputStreamReader(establishConnection(url, token).getInputStream()));
            System.out.println(in.readLine() + "\n");
        }
    }
}