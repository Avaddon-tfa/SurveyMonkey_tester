import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.*;

class JsonWorker {

    static ArrayList<String> parseResponseIDs (String jsonString) throws ParseException {

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

     static Map<String, String> getResponseIDMap (String responseJson) {

         Map<String, String > allSurveyIds = new HashMap<>();

         JSONParser parser = new JSONParser();
         try {
             JSONObject jsonFullResponse = (JSONObject) parser.parse(responseJson);
             JSONArray surveyPages = (JSONArray) jsonFullResponse.get("pages");

             int i = 0;

             while (i < surveyPages.size()) {

                 int j = 0;

                 JSONObject p = (JSONObject) surveyPages.get(i);
                 JSONArray questionsOnPage = (JSONArray) p.get("questions");

                 //System.out.println("Page " + i + " of " + surveyPages.size() + " " + questionsOnPage.size() + "\n");


                 while (j < questionsOnPage.size()) {
                     JSONObject question = (JSONObject) questionsOnPage.get(j);
                     JSONArray questionHeading = (JSONArray) question.get("headings");
                     JSONObject questionTemp = (JSONObject) questionHeading.get(0);
                     String questionName = (String) questionTemp.get("heading");
                     String questionId = (String) question.get("id");

                     try {
                         JSONObject answersList = (JSONObject) question.get("answers");
                         JSONArray choices = (JSONArray) answersList.get("choices");

                         for (Object choice1 : choices) {
                             JSONObject choice = (JSONObject) choice1;
                             String choicesId = (String) choice.get("id");
                             String choiceText = (String) choice.get("text");
                             Long choiceWeight = (Long) choice.get("weight");
                             //System.out.println("Page " + i + " Question: " + questionName + " " + choicesId
                             //        + " : " + choiceText + " (" + choiceWeight + ")");
                             //allSurveyIds.put(choicesId, choiceText);
                             if (choiceWeight != null)
                             allSurveyIds.put(choicesId, questionName + ": " + choiceText);
                         }

                     } catch (NullPointerException e) {
                         System.out.println("getResponseIDMap NPE");
                     }
                     j++;

                     allSurveyIds.put(questionId, questionName);
                 }
                i++;
             }

         } catch (ParseException e) {
             e.printStackTrace();
         }

         return allSurveyIds;
     }

    static List<String> parseResponse (String responseJson) throws ParseException {

        JSONParser parser = new JSONParser();
        List<String> parsedResponse = new ArrayList<>();

        JSONObject jsonFullResponse = (JSONObject) parser.parse(responseJson);
        JSONArray questionsList = (JSONArray) jsonFullResponse.get("pages");

        int i = 0;

        while (i < questionsList.size()) {
            int j= 0;

            JSONObject jsonAnswers = (JSONObject) questionsList.get(i);
            JSONArray qaList = (JSONArray) jsonAnswers.get("questions");


            while (j < qaList.size()) {
                JSONObject temp = (JSONObject) qaList.get(j);
                JSONArray answersList = (JSONArray) temp.get("answers");
                    for (int z = 0; z < answersList.size(); z++) {
                        JSONObject answer = (JSONObject) answersList.get(z);
                        String answerId = (String) answer.get("choice_id");
                        parsedResponse.add(answerId);
                    }
                j++;
            }
            i++;
        }

        return parsedResponse;
    }
}
