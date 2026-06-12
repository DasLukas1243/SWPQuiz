import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {

    private StartWindow startfenster;

    public StartWindow() {
        startfenster = this;
        setTitle("SWP Quiz");
        setSize(500, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Titel
        JLabel title = new JLabel("SWP Quiz");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBorder(new EmptyBorder(20, 0, 20, 0));

        add(title, BorderLayout.NORTH);

        // Mittlerer Bereich
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBorder(new EmptyBorder(10, 40, 20, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(250, 30));
        centerPanel.add(nameField, gbc);

        gbc.gridy++;
        JButton startButton = new JButton("Start");
        centerPanel.add(startButton, gbc);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QuizWindow quizWindow = new QuizWindow();
                startfenster.dispose();
                
            }
                                      }
        );

        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
