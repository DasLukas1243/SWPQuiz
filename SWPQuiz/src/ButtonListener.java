import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private QuizWindow quizWindow;
    private Quiz quiz;
    private int questionNumber;
    private int answerIndex;
    private Boolean correct;

    public ButtonListener(QuizWindow frame, Quiz quiz, int answerIndex, int questionNumber) {
        this.quizWindow = frame;
        this.quiz = quiz;
        this.questionNumber = questionNumber;
        this.answerIndex = answerIndex;  // Wichtig: Speichern welche Antwort geklickt wurde!
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Prüfe ob wir noch Fragen haben
        if (questionNumber < quiz.getQuestions().size()) {
            // Hole die richtige Antwort mit answerIndex!
            correct = quiz.getQuestions()
                    .get(questionNumber)
                    .getAnswers()
                    .get(answerIndex)  // ✅ RICHTIG: answerIndex, nicht questionNumber!
                    .isCorrect();

            // Feedback geben
            if (correct) {
                quiz.addPoint();
                JOptionPane.showMessageDialog(quizWindow, "✅ Richtig!");
            } else {
                JOptionPane.showMessageDialog(quizWindow, "❌ Falsch!");
            }

            // Nächste Frage laden
            quizWindow.updateQuestion(questionNumber + 1);
        }
    }
}