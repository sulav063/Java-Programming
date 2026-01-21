package chapter2swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserAWT extends JFrame implements ActionListener {

    // Container
    Container c;

    // Button to open color chooser
    JButton b;

    // Constructor
    public ColorChooserAWT() {

        // Get content pane
        c = getContentPane();

        // Set FlowLayout
        c.setLayout(new FlowLayout());

        // Create button
        b = new JButton("Choose Color");

        // Add ActionListener
        b.addActionListener(this);

        // Add button to container
        c.add(b);
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {

        // Initial color is RED
        Color initialColor = Color.RED;

        // Open ColorChooser dialog
        Color color = JColorChooser.showDialog(this, "Select a Color", initialColor);

        // If user selects a color, set container background
        if (color != null) {
            c.setBackground(color);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create object of ColorChooserAWT
        ColorChooserAWT ch = new ColorChooserAWT();

        // Set frame size
        ch.setSize(400, 300);

        // Set frame visible
        ch.setVisible(true);

        // Set default close operation
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
