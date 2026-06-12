import javax.swing.*;

public class Questions {
    private JLabel question;
    private JLabel answer;
    private JLabel correct;


    public void setQuestion(JLabel question) {
        this.question = question;
    }
    public void setAnswer(JLabel answer) {
        this.answer = answer;
    }
    public void setCorrect(JLabel correct) {
        this.correct = correct;
    }
    public JLabel getQuestion() {
        return question;
    }
    public JLabel getAnswer() {
        return answer;
    }
    public JLabel getCorrect() {
        return correct;
    }
}
