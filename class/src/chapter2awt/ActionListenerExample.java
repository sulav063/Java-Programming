package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame
        implements ActionListener, WindowListener {

    TextField tf;
    Button b;

    public ActionListenerExample() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        b = new Button("Click Me");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);

        add(tf);
        add(b);

        addWindowListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public void windowClosing(WindowEvent e) {
        dispose();   // closes the frame
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
