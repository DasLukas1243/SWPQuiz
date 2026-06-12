import javax.swing.*;

public class AnwserButton extends JButton {
    private Anwser anwser;

    public AnwserButton(Anwser anwser) {
        this.anwser = anwser;
    }

    public Anwser getAnwser() {
        return anwser;
    }

    Anwser a1 = new Anwser("Anwser 1", true);
}
