package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterExample extends MouseMotionAdapter {

    Frame f;

    // Constructor
    public MouseMotionAdapterExample() {
        f = new Frame("Mouse Motion Adapter Example");

        // Register mouse motion listener
        f.addMouseMotionListener(this);

        // Window close handling
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    // Mouse dragged event
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    // Main method
    public static void main(String[] args) {
        new MouseMotionAdapterExample();
    }
}
