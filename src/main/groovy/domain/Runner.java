package domain;

import Services.JsonWorker;
import Services.SurveyService;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Runner extends Thread {

    //private JTextField putSurveyIDHereTextField;
    private JTextArea textArea1;

    private String id;

    public void setId(String id) {

        this.id = id;

    }

    public void setTextArea1(JTextArea textArea) {

        this.textArea1 = textArea;

    }

    public void run() {


        SurveyService surveyService = new SurveyService();

        try {

            List<Question> surveyKeys = JsonWorker.getResponseIDMap(surveyService.getSurveyDetails(id, Constants.token, Constants.apiKey));

            List<List<String>> allResponses = surveyService.getAllDetailedResponses(id, Constants.token, Constants.apiKey);

            Map<String, BigDecimal> result = surveyService.responseProcessor(allResponses, surveyKeys);

            int counter = 0;
            for (Map.Entry<String, BigDecimal> entry : result.entrySet()) {

                counter++;
                textArea1.append(counter + ". " + entry.getKey() + ": " + entry.getValue() + "\n");

            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}



