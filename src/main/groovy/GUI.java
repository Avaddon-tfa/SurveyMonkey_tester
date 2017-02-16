import Services.JsonWorker;
import Services.SurveyService;
import domain.Constants;
import domain.Question;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


class GUI extends JFrame {

    private JTextField putSurveyIDHereTextField;
    private JButton startButton;
    private JTextArea textArea1;
    private JPanel panel1;

    public GUI() {

        super ("SurveyMonkey processor");

        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String surveyId = putSurveyIDHereTextField.getText();

                SurveyService surveyService = new SurveyService();

                try {
                    List<Question> surveyKeys = JsonWorker.getResponseIDMap(surveyService.getSurveyDetails(surveyId, Constants.token, Constants.apiKey));

                    List<List<String>> allResponses = surveyService.getAllDetailedResponses(surveyId, Constants.token, Constants.apiKey);

                Map<String, Double> result = surveyService.responseProcessor(allResponses, surveyKeys);

                Iterator<Map.Entry<String, Double>> entries = result.entrySet().iterator();
                while (entries.hasNext()) {

                    Map.Entry<String, Double> entry = entries.next();

                    textArea1.append(entry.getKey() + ": " + entry.getValue() + "\n");
                }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        setVisible(true);

    }
}
