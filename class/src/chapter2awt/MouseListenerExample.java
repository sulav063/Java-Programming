package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame
        implements MouseListener, WindowListener {

    Label l;

    public MouseListenerExample() {
        l = new Label();
        l.setBounds(50, 100, 200, 30);

        add(l);
        addMouseListener(this);
        addWindowListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void windowClosing(WindowEvent e) {
        dispose();
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
