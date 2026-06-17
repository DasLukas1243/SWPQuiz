import javax.swing.*;
import java.awt.*;

public class QuizWindow extends JFrame {

    QuizWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        // Hauptlayout
        setLayout(new BorderLayout());

        // Frage oben
        JLabel question = new JLabel("Funktioniere ich?", SwingConstants.CENTER);
        question.setFont(new Font("Arial", Font.BOLD, 18));
        add(question, BorderLayout.NORTH);

        // Panel für die Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton A1 = new JButton("Ja");
        JButton A2 = new JButton("Nein");
        JButton A3 = new JButton("Ich will zu Mama!");

        buttonPanel.add(A1);
        buttonPanel.add(A2);
        buttonPanel.add(A3);

        add(buttonPanel, BorderLayout.CENTER);

        // Reaktion auf Klick auf "Ja"
        A1.addActionListener(e -> {
            JFrame right = new JFrame("Richtig geraten du Kartoffel!");
            right.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            right.setSize(300, 200);
            right.setLocationRelativeTo(null);
            right.add(new JLabel("RICHTIG! (schließe mich indem du aufs X klickts)", SwingConstants.CENTER));
            right.setVisible(true);

        });

        setVisible(true);
    }
}