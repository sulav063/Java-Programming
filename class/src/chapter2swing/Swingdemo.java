package chapter2swing;

import javax.swing.*;

public class Swingdemo extends JFrame {

    // Declare components
    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    JPasswordField t2, t3;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;

    // Constructor
    public Swingdemo() {
        setTitle("Registration Form");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setComponents();

        setVisible(true);
    }

    // Method to set and add components
    public void setComponents() {

        // Labels
        l1 = new JLabel("Name:");
        l2 = new JLabel("Password:");
        l3 = new JLabel("Confirm Password:");
        l4 = new JLabel("Gender:");
        l5 = new JLabel("Hobbies:");

        // Text fields
        t1 = new JTextField();
        t2 = new JPasswordField();
        t3 = new JPasswordField();

        // Radio buttons
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        // Group radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Check boxes
        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Reading");

        // Button
        b1 = new JButton("Register");

        // Set bounds (x, y, width, height)
        l1.setBounds(50, 50, 150, 30);
        t1.setBounds(200, 50, 200, 30);

        l2.setBounds(50, 100, 150, 30);
        t2.setBounds(200, 100, 200, 30);

        l3.setBounds(50, 150, 150, 30);
        t3.setBounds(200, 150, 200, 30);

        l4.setBounds(50, 200, 150, 30);
        r1.setBounds(200, 200, 80, 30);
        r2.setBounds(300, 200, 80, 30);

        l5.setBounds(50, 250, 150, 30);
        c1.setBounds(200, 250, 80, 30);
        c2.setBounds(290, 250, 80, 30);
        c3.setBounds(380, 250, 90, 30);

        b1.setBounds(200, 320, 120, 40);

        // Add components to frame
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(r1); add(r2);
        add(l5); add(c1); add(c2); add(c3);
        add(b1);
    }

    // Main method
    public static void main(String[] args) {
        new Swingdemo();
    }
}
