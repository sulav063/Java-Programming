package chapter2swing;

import javax.swing.*;

public class JPanel {

    JFrame f;

    // Constructor
    JPanel() {
        f = new JFrame("JOptionPane Example");

        // Show message dialog
        JOptionPane.showMessageDialog(f, "Hello, Welcome to ACHS");

        // Frame settings
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new JPanel();
    }
}
