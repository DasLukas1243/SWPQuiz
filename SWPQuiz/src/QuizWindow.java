import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;

public class QuizWindow extends JFrame {
    QuizWindow() {
        JFrame frame = new JFrame("Hauptframe");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JButton startbutton = new JButton("Start");
        frame.add(startbutton,BorderLayout.SOUTH);




        frame.setVisible(true);
    }

}
