package chapter2swing;

import javax.swing.*;

public class GroupLayoutExample {

    JFrame f = new JFrame("GroupLayout Example");

    // Constructor
    GroupLayoutExample() {

        // Create buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        // Create GroupLayout
        GroupLayout layout = new GroupLayout(f.getContentPane());
        f.getContentPane().setLayout(layout);

        // Enable gaps
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(b5)
                        .addComponent(b3)
                        .addComponent(b1)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(b2)
                        .addComponent(b4)
                        .addComponent(b6)
                )
        );

        // Vertical grouping
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b6)
                        .addComponent(b1)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b4)
                        .addComponent(b3)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(b5)
                        .addComponent(b2)
                )
        );

        // Frame settings
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new GroupLayoutExample();
    }
}