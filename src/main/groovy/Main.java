//migrated to MacOS

class Main {

    public static void main(String[]args) throws Exception {

        GUI form = new GUI();

        /*SurveyService surveyService = new SurveyService();

        //System.out.println(surveyService.getSurveyList(Constants.token, Constants.apiKey));
        //surveyService.getSurveyDetails(surveyID, Constants.token, Constants.apiKey);

        String surveyID = "85694193";

        List<Question> surveyKeys = JsonWorker.getResponseIDMap(surveyService.getSurveyDetails(surveyID, Constants.token, Constants.apiKey));
        List<List<String>> allResponses = surveyService.getAllDetailedResponses(surveyID, Constants.token, Constants.apiKey);

        Map<String, Double> result = surveyService.responseProcessor(allResponses, surveyKeys);

        Iterator<Map.Entry<String, Double>> entries = result.entrySet().iterator();
        while (entries.hasNext()) {

            Map.Entry<String, Double> entry = entries.next();

            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        */
    }
}