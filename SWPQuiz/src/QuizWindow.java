import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class QuizWindow extends JFrame {










    QuizWindow(String playerName) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        Answer a1 = new Answer("Ja",true);
        Answer a2 = new Answer("Nein",false);
        Answer a3 = new Answer("Weiß nicht",false);
        ArrayList<Answer> liste1 = new ArrayList();
        liste1.add(0,a1);
        liste1.add(1,a2);
        liste1.add(2,a3);
        Questions q1 = new Questions("Funktioniere ich?", liste1);

        // Hauptlayout
        setLayout(new BorderLayout());

        // Frage oben
        JLabel question = new JLabel("Frage 1", SwingConstants.CENTER);
        question.setFont(new Font("Arial", Font.BOLD, 18));
        add(question, BorderLayout.NORTH);

        // Panel für die Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JButton A1 = new JButton("Hallo" + playerName);
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

            question.setText("Das ist die nächste Frage");
            A1.setText("A1");
            A2.setText("A2");
            A3.setText("A3");

        });

        A2.addActionListener(e -> {
            JFrame right = new JFrame("Flasch");
            right.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            right.setSize(300, 200);
            right.setLocationRelativeTo(null);
            right.add(new JLabel("NEIN", SwingConstants.CENTER));
            right.setVisible(true);

        });

        A3.addActionListener(e -> {
            JFrame right = new JFrame("Ich auch");
            right.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            right.setSize(300, 200);
            right.setLocationRelativeTo(null);
            right.add(new JLabel("I mag huam", SwingConstants.CENTER));
            right.setVisible(true);

        });

        setVisible(true);
    }
}