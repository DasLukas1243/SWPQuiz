import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

public class ButtonListener implements ActionListener {

    private QuizWindow quizWindow;

    private Quiz quiz;
    private Questions question;
    private int questionNumber;
    private int answerIndex;
    private Answer answer;

    private Boolean correct;

    public ButtonListener(QuizWindow frame, Quiz quiz,  int answerIndex,  int questionNumber) {
        quizWindow = frame;
        this.quiz = quiz ;
        this.questionNumber = questionNumber;
        this.question = quiz.getQuestions().get(questionNumber);
        answer = question.getAnswers().get(questionNumber);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        correct = answer.isCorrect();
        if(questionNumber < quiz.getQuestions().size()) {
            questionNumber++;
            if (correct) {
                JOptionPane.showMessageDialog(quizWindow, "Correct Answer");
            }
            else {
                JOptionPane.showMessageDialog(quizWindow, "Incorrect Answer");
            }
            quizWindow.updateQuestion(questionNumber);
        }
        else  {
            JOptionPane.showMessageDialog(quizWindow, "No more Questions");
        }
    }
}
