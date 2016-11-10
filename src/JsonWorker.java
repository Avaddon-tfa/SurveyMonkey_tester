import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

class JsonWorker {

    static ArrayList<String> getResponseIDs (String jsonString) throws ParseException {

        JSONParser parser = new JSONParser();

        JSONObject jsonFullData = (JSONObject) parser.parse(jsonString);
        JSONArray responseList = (JSONArray) jsonFullData.get("data");

        ArrayList<String> idList = new ArrayList<>();

        for (int i = 0; i < responseList.size(); i++) {
            JSONObject temp = (JSONObject) responseList.get(i);
            idList.add(i, temp.get("id").toString());
            //System.out.println(idList.get(i));
        }
        return idList;
    }

    static void parseResponse (String responseJson) throws ParseException {

        JSONParser parser = new JSONParser();

        JSONObject jsonFullResponse = (JSONObject) parser.parse(responseJson);
        JSONArray questionsList = (JSONArray) jsonFullResponse.get("pages");

        int i = 0;
        int j= 0;
        while (i < questionsList.size()) {
            JSONObject jsonAnswers = (JSONObject) questionsList.get(i);
            JSONArray qaList = (JSONArray) jsonAnswers.get("questions");
            System.out.println(qaList.toString());
            i++;

            while (j < qaList.size()) {
                JSONObject temp = (JSONObject) qaList.get(j);
                JSONArray answersList = (JSONArray) temp.get("answers");
                System.out.println(answersList.toString());
                j++;
            }
            //здесь еще надо допилить разбор отдельных пунктов, плюс разобраться, как АПИ-контроллеру определять, что значат
            //плучаемые ID
        }

    }
}
