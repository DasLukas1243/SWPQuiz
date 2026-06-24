import javax.swing.*;
import java.awt.*;

//Fenster für Punktesystem
public class ScoreWindow extends JFrame {


    public ScoreWindow(int score) {

        setTitle("Dein Ergebnis");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JLabel scoreLabel = new JLabel("Spiel vorbei! Deine Punkte: " + score, SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));


        add(scoreLabel, BorderLayout.CENTER);


        setVisible(true);
    }
}