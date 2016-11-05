import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class API_Controller {

    String getSurveyList(String token, String key) {
        try {
            String url = "https://api.surveymonkey.net/v3/surveys?api_key=" + key;

            URL readUrl = new URL(url);
            URLConnection connection = readUrl.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + token);
            connection.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            return in.readLine() + "\n";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

     String getSurvey(String id, String token, String key) throws Exception {

            String url = "https://api.surveymonkey.net/v3/surveys/"+ id + "?api_key=" + key;

            URL readUrl = new URL(url);
            URLConnection connection = readUrl.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + token);
            connection.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        return in.readLine() + "\n";
    }

    String getResponse(String id, String token, String key) throws Exception {

        String url = "https://api.surveymonkey.net/v3/surveys/"+ id + "/responses?api_key=" + key;

        URL readUrl = new URL(url);
        URLConnection connection = readUrl.openConnection();
        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.connect();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        return in.readLine() + "\n";
    }
}