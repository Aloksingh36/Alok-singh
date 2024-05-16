import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Label label;
    TextArea area;

    KeyListenerExample() {
        label = new Label();
        label.setBounds(20, 50, 100, 20);
        add(label);

        area = new TextArea();
        area.setBounds(20, 100, 200, 100);
        area.addKeyListener(this);
        add(area);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
