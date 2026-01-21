package chapter2swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    JFrame f = new JFrame("BorderLayout Example");

    // Constructor
    BorderLayoutDemo() {

        // Create buttons
        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");

        // Set BorderLayout with gaps (hgap = 2, vgap = 2)
        f.setLayout(new BorderLayout(2, 2));
        
        // Add buttons to frame
        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2, BorderLayout.SOUTH);
        f.add(btn3, BorderLayout.EAST);
        f.add(btn4, BorderLayout.WEST);
        f.add(btn5, BorderLayout.CENTER);

        // Frame settings
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
