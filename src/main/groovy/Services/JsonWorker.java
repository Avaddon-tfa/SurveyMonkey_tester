package Services;

import domain.Choice;
import domain.Question;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.*;

public class JsonWorker {

    static ArrayList<String> parseResponseIDs (String jsonString) throws ParseException {

        JSONParser parser = new JSONParser();

        JSONObject jsonFullData = (JSONObject) parser.parse(jsonString);
        JSONArray responseList = (JSONArray) jsonFullData.get("data");

        ArrayList<String> idList = new ArrayList<>();

        for (int i = 0; i < responseList.size(); i++) {

            JSONObject temp = (JSONObject) responseList.get(i);
            idList.add(i, temp.get("id").toString());

        }
        return idList;
    }

     public static ArrayList<Question> getResponseIDMap(String responseJson) {

         ArrayList<Question> questionsList = new ArrayList<>();

         JSONParser parser = new JSONParser();
         try {
             JSONObject jsonFullResponse = (JSONObject) parser.parse(responseJson);
             JSONArray surveyPages = (JSONArray) jsonFullResponse.get("pages");

             int i = 0;

             while (i < surveyPages.size()) {

                 int j = 0;

                 JSONObject p = (JSONObject) surveyPages.get(i);
                 JSONArray questionsOnPage = (JSONArray) p.get("questions");

                 while (j < questionsOnPage.size()) {
                     JSONObject question = (JSONObject) questionsOnPage.get(j);
                     JSONArray questionHeading = (JSONArray) question.get("headings");
                     JSONObject questionTemp = (JSONObject) questionHeading.get(0);
                     String questionName = (String) questionTemp.get("heading");
                     String questionId = (String) question.get("id");

                     Question tempQuestion = new Question();
                     tempQuestion.setId(questionId);
                     tempQuestion.setText(questionName);

                     try {
                         JSONObject answersList = (JSONObject) question.get("answers");
                         JSONArray choices = (JSONArray) answersList.get("choices");

                         List<Choice> tempChoisesList = new ArrayList<>();

                         for (Object choice1 : choices) {
                             JSONObject choice = (JSONObject) choice1;

                             String choicesId = (String) choice.get("id");
                             String choiceText = (String) choice.get("text");
                             Long choiceWeight = (Long) choice.get("weight");

                             Choice newChoice = new Choice();

                             newChoice.setId(choicesId);
                             newChoice.setText(choiceText);
                             newChoice.setWeight(choiceWeight);

                             tempChoisesList.add(newChoice);

                         }

                         tempQuestion.setChoices(tempChoisesList);

                     } catch (NullPointerException e) {
                     }
                     j++;

                     questionsList.add(tempQuestion);
                 }
                i++;
             }

         } catch (ParseException e) {
             e.printStackTrace();
         }

         return questionsList;
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

                for (Object anAnswersList : answersList) {
                    JSONObject answer = (JSONObject) anAnswersList;
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
