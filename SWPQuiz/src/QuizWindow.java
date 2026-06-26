import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
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
    JPanel panelAnswer;  // ✅ Als Klassenfeld speichern

    public QuizWindow(String playerName, Quiz quiz) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        this.quiz = quiz;
        this.playerName = playerName;
        questionCount = 0;

        JPanel panelQuiz = new JPanel();
        panelQuiz.setLayout(new BoxLayout(panelQuiz, BoxLayout.Y_AXIS));

        JPanel panelQuestion = new JPanel();
        panelQuestion.setLayout(new BoxLayout(panelQuestion, BoxLayout.Y_AXIS));

        panelAnswer = new JPanel();
        panelAnswer.setLayout(new BoxLayout(panelAnswer, BoxLayout.Y_AXIS));

        panelQuiz.add(panelQuestion);
        panelQuiz.add(panelAnswer);

        questionLabel = new JLabel();
        panelQuestion.add(questionLabel);

        answer1Button = new JButton();
        answer2Button = new JButton();
        answer3Button = new JButton();

        panelAnswer.add(answer1Button);
        panelAnswer.add(answer2Button);
        panelAnswer.add(answer3Button);

        scoreLabel = new JLabel();
        panelAnswer.add(scoreLabel);

        this.add(panelQuiz);

        // ✅ WICHTIG: Erste Frage laden
        updateQuestion(0);

        setVisible(true);
    }

    public void updateQuestion(int newQuestionCount) {
        this.questionCount = newQuestionCount;

        if (questionCount < quiz.getQuestions().size()) {
            question = quiz.getQuestions().get(questionCount);
            answer1 = question.getAnswers().get(0);
            answer2 = question.getAnswers().get(1);
            answer3 = question.getAnswers().get(2);

            questionLabel.setText("Frage " + (questionCount + 1) + ": " + question.getText());
            answer1Button.setText(answer1.getText());
            answer2Button.setText(answer2.getText());
            answer3Button.setText(answer3.getText());

            // ✅ WICHTIG: Alte ActionListener entfernen!
            for (var listener : answer1Button.getActionListeners()) {
                answer1Button.removeActionListener(listener);
            }
            for (var listener : answer2Button.getActionListeners()) {
                answer2Button.removeActionListener(listener);
            }
            for (var listener : answer3Button.getActionListeners()) {
                answer3Button.removeActionListener(listener);
            }

            // ✅ NEUE ActionListener mit aktueller questionCount erstellen!
            answer1Button.addActionListener(new ButtonListener(this, quiz, 0, questionCount));
            answer2Button.addActionListener(new ButtonListener(this, quiz, 1, questionCount));
            answer3Button.addActionListener(new ButtonListener(this, quiz, 2, questionCount));

            scoreLabel.setText("Punkte: " + quiz.getScore() + " / " + quiz.getQuestions().size());
        }
        else {
            JOptionPane.showMessageDialog(null,
                    playerName + ", du hast das Quiz mit " + quiz.getScore() +
                            " Punkten geschafft! 🎉",
                    "Quiz beendet",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}
// versuch zu pushen