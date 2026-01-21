package chapter2swing;

import javax.swing.*;
import java.awt.*;

public class Gridlayout {

    JFrame f = new JFrame("GridLayout Example");

    // Constructor
    Gridlayout() {

        // Create buttons
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        JButton b5 = new JButton("E");
        JButton b6 = new JButton("F");
        JButton b7 = new JButton("G");
        JButton b8 = new JButton("H");
        JButton b9 = new JButton("I");

        // Add buttons to frame
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        // Set GridLayout (3 rows, 3 columns, hgap=20, vgap=20)
        f.setLayout(new GridLayout(4, 2, 20, 20));

        // Frame settings
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new Gridlayout();
    }
}
