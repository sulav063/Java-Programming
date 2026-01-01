package chapter2swing;

import javax.swing.*;

public class Frametest {
    public static void main(String[] args) {

        // Create a JFrame (main window)
        JFrame frame = new JFrame("Button Example");

        // Create a JButton with text
        JButton button = new JButton("Click Me");

        /*
         * setBounds(x, y, width, height)
         * x      -> distance from left of the frame
         * y      -> distance from top of the frame
         * width  -> width of the button
         * height -> height of the button
         */
        button.setBounds(150, 200, 220, 50);

        // Add button to the frame
        frame.add(button);

        // Set size of the frame (width, height)
        frame.setSize(500, 600);

        // Disable layout manager (use absolute positioning)
        frame.setLayout(null);

        // Close application when frame is closed

        // Make the frame visible on screen
        frame.setVisible(true);
    }
}
