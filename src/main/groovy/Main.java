//migrated to MacOS

import domain.Constants;

import java.io.File;
import java.util.List;
import java.util.Map;

class Main {

    public static void main(String[]args) throws Exception {

        SurveyService surveyService = new SurveyService();

        //System.out.println(surveyService.getSurveyList(Constants.token, Constants.apiKey));
        //surveyService.getSurveyDetails(surveyID, Constants.token, Constants.apiKey);

        String surveyID = "85694193";

        Map<String, String> surveyKeys = JsonWorker.getResponseIDMap(surveyService.getSurveyDetails(surveyID, Constants.token, Constants.apiKey));
        List<List<String>> allResponses = surveyService.getAllDetailedResponses(surveyID, Constants.token, Constants.apiKey);

        System.out.println(surveyService.responseProcessor(allResponses, surveyKeys));

    }
}