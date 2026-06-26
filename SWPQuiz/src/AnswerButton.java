import javax.swing.*;

public class AnswerButton extends JButton {
    private Answer answer;

    public AnswerButton(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnwser() {
        return answer;
    }

}
///// Push versuch