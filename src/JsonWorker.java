import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

class JsonWorker {

    static ArrayList<String> getResponseIDs(String jsonString) throws ParseException {

        JSONParser parser = new JSONParser();

        JSONObject jsonFullData = (JSONObject) parser.parse(jsonString);
        JSONArray responseList = (JSONArray) jsonFullData.get("data");

        ArrayList<String> idList = new ArrayList<>();

        for (int i = 0; i < responseList.size(); i++) {
            JSONObject temp = (JSONObject) responseList.get(i);
            idList.add(i, temp.get("id").toString());
            System.out.println(idList.get(i));
        }
        return idList;
    }
}
