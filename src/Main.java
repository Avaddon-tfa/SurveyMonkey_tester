class Main{
    public static void main(String[]args) throws Exception {

        API_Controller surveyController = new API_Controller();

        //System.out.println(surveyController.getSurveyList(CONSTANT.token, CONSTANT.apiKey));

        String surveyID = "86455498";
        //System.out.println(surveyController.getSurvey(surveyID, CONSTANT.token, CONSTANT.apiKey));

        surveyController.getDetailedResponse(surveyID, CONSTANT.token, CONSTANT.apiKey);


    }
}