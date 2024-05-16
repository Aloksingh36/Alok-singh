import javax.swing.*;

// Drive class;
public class myjFrame {
    public static void main(String[] args) {
        // Create new jFrame
        JFrame frame = new JFrame("My First JFrame");

        // Create a label
        JLabel label = new JLabel("Bca third semester group");
        // Add the label to the frame
        frame.add(label);

        //Set frame properties
        frame.setSize(500,500); // Set the size of the frame

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
