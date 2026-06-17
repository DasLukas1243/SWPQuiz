import java.util.ArrayList;

public class Questions {
    private String text;
    private ArrayList<Anwser> answers;

    public Questions(String text, ArrayList<Anwser> answers) {
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Anwser> getAnswers() {
        return answers;
    }

}
