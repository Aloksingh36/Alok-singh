import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    Label I;

    MouseListenerExample() {
        I = new Label();
        I.setBounds(20, 30, 100, 20);
        add(I);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        I.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        I.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        I.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        I.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        I.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
