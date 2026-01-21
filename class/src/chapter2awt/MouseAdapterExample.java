package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends MouseAdapter {

    Frame f;

    // Constructor
    MouseAdapterExample() {
        f = new Frame("Mouse Adapter Example");

        // Register mouse listener
        f.addMouseListener(this);

        // Handle window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();   // close the frame
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    // Mouse click event
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    // Main method
    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
