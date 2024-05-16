import javax.swing.*;
import java.awt.*;

public class testswing extends JFrame {
        testswing()
        {
            JButton bt1 = new JButton("yes"); // Create a Yes
            JButton bt2 = new JButton("No");  // Create a No
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  // Setting close operation
            setLayout(new FlowLayout()); // Setting layout using FlowLayout object
            setSize(400,400);  // Setting size of JFrame.
            add(bt1);  // adding Yes button to Frame.
            add(bt2);  // adding No button to Frame.

            setVisible(true);
        }
        public static void main(String[]args)
        {
            new testswing();
    }
}
