package chapter2swing;

import javax.swing.*;
import java.awt.event.*;

public class FileChooserExample {
    public static void main(String[] args) {

        // Create JFrame
        JFrame f = new JFrame("File Chooser Example");

        // Create Button
        JButton b = new JButton("Open File");

        // setBounds(x, y, width, height)
        b.setBounds(120, 80, 150, 40);

        // Button click event
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Create FileChooser
                JFileChooser fc = new JFileChooser();

                // Open dialog
                fc.showOpenDialog(f);
            }
        });

        // Add button to frame
        f.add(b);

        // Frame settings
        f.setLayout(null);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
