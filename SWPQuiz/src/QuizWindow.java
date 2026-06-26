import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QuizWindow extends JFrame {
    private int questionCount;
    private Quiz quiz;
    private Questions question;
    private Answer answer1;
    private Answer answer2;
    private Answer answer3;
    private String playerName;


    JLabel scoreLabel;
    JLabel questionLabel;
    JButton answer1Button;
    JButton answer2Button;
    JButton answer3Button;

    public QuizWindow(String playerName, Quiz quiz) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        this.quiz = quiz;
        this.playerName = playerName;
        questionCount = 0;

        JPanel panelQuiz = new JPanel();
        panelQuiz.setLayout(new BoxLayout(panelQuiz, BoxLayout.Y_AXIS));
        JPanel panelQuestion = new JPanel();
        panelQuestion.setLayout(new BoxLayout(panelQuestion, BoxLayout.Y_AXIS));
        JPanel panelAnswer = new JPanel();
        panelAnswer.setLayout(new BoxLayout(panelAnswer, BoxLayout.Y_AXIS));

        panelQuiz.add(panelQuestion);
        panelQuiz.add(panelAnswer);

        question = quiz.getQuestions().getFirst();

        questionLabel = new JLabel(question.getText());
        panelQuestion.add(questionLabel);

        answer1 = quiz.getQuestions().getFirst().getAnswers().getFirst();
        answer2 = quiz.getQuestions().getFirst().getAnswers().get(1);
        answer3 = quiz.getQuestions().getFirst().getAnswers().get(2);

        answer1Button = new JButton(answer1.getText());
        answer1Button.addActionListener(new ButtonListener(this, quiz, 0, questionCount));
        answer2Button = new JButton(answer2.getText());
        answer2Button.addActionListener(new ButtonListener(this, quiz, 1, questionCount));
        answer3Button = new JButton(answer3.getText());
        answer3Button.addActionListener(new ButtonListener(this, quiz, 2, questionCount));
        panelAnswer.add(answer1Button);
        panelAnswer.add(answer2Button);
        panelAnswer.add(answer3Button);

        scoreLabel = new JLabel();
        scoreLabel.setText("Punkte: " + quiz.getScore());
        panelAnswer.add(scoreLabel);

        this.add(panelQuiz);



        setVisible(true);
    }

    public void updateQuestion(int questionCount) {
        this.questionCount = questionCount;
        if (questionCount < quiz.getQuestions().size()) {
            this.question = quiz.getQuestions().get(questionCount);
            answer1 = question.getAnswers().get(0);
            answer2 = question.getAnswers().get(1);
            answer3 = question.getAnswers().get(2);

            questionLabel.setText(question.getText());
            answer1Button.setText(answer1.getText());
            answer2Button.setText(answer2.getText());
            answer3Button.setText(answer3.getText());

            scoreLabel.setText("Punkte: " + quiz.getScore());
        }
        else {
            JOptionPane.showMessageDialog(null, playerName + ", du hast das Quiz geschafft!");
            dispose();
        }
    }
}
// versuch zu pushen