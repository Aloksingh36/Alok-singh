import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    JFrame frameOBJ;

    // Constructor
    GridLayoutExample()
    {
        frameOBJ = new JFrame();
        // creating 9 buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        // adding button to the frame
        // since, we are using the parameterless constructor, therefore;
        // the number of columns is equal to the number of buttons we are adding to the frame. The row count remains one.
        frameOBJ.add(btn1);frameOBJ.add(btn2);frameOBJ.add(btn3);
        frameOBJ.add(btn4);frameOBJ.add(btn5);frameOBJ.add(btn6);
        frameOBJ.add(btn7);frameOBJ.add(btn8);frameOBJ.add(btn9);

        // Setting the grid layout using the parameterless constructor
        frameOBJ.setLayout(new GridLayout());
        frameOBJ.setSize(400,400);
        frameOBJ.setVisible(true);
    }
    // main method
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
