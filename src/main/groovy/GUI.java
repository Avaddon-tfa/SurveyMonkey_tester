import Services.JsonWorker;
import Services.SurveyService;
import domain.Constants;
import domain.Question;
import domain.Runner;

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
    private JScrollBar scrollBar1;

    public GUI() {

        super ("SurveyMonkey processor");

        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Runner runner = new Runner();

                runner.setId(putSurveyIDHereTextField.getText());
                runner.setTextArea1(textArea1);

                runner.start();

            }
        });

        setVisible(true);

    }
}
