import javax.swing.*;
import java.awt.FlowLayout;

public class FlowlayoutExample {
    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame frame = new JFrame("Layout");
        // Define new buttons
        JButton jb1 = new JButton("Buttons 1");
        JButton jb2 = new JButton("Buttons 2");
        JButton jb3 = new JButton("Buttons 3");

        // Define the panel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());  // Setting flowlayout
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        // Set the window to be visible as a default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
