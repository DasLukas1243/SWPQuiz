import javax.swing.*;

public class AnswerButton extends JButton {
    private Answer answer;

    public AnswerButton(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnwser() {
        return answer;
    }

    Answer a1 = new Answer("Answer 1", true);
    Answer a2 = new Answer("Answer 2", false);
    Answer a3 = new Answer("Answer 3", false);
}
