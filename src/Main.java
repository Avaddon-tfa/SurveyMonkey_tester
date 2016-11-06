class Main{
    public static void main(String[]args) throws Exception {

        API_Controller surveyController = new API_Controller();

        System.out.println(surveyController.getSurveyList(CONSTANT.token, CONSTANT.apiKey));

        String surveyID = "86455498";
        System.out.println(surveyController.getSurvey(surveyID, CONSTANT.token, CONSTANT.apiKey));
        //System.out.println(surveyController.getResponse(surveyID, CONSTANT.token, CONSTANT.apiKey));

        JsonWorker.getResponseIDs(surveyController.getResponse(surveyID, CONSTANT.token, CONSTANT.apiKey));
    }
}