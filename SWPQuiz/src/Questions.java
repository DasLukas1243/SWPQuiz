import javax.swing.*;
import java.util.ArrayList;

public class Questions {
    private String text;
    private ArrayList<Answer> answers;

    public Questions(String text, ArrayList<Answer> answers) {
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

}
