package chapter2swing;

import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {

        // Create JFrame
        JFrame f = new JFrame("ComboBox Example");

        // String array with 5 country names
        String[] country = {"Nepal", "India", "China", "USA", "Japan"};

        // Create JComboBox
        JComboBox<String> cb = new JComboBox<>(country);

        // setBounds(x, y, width, height)
        cb.setBounds(100, 50, 150, 30);

        // Add combo box to frame
        f.add(cb);

        // Frame settings
        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
