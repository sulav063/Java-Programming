package chapter2swing;

import javax.swing.*;

public class SwingForm extends JFrame {

    // Labels
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;

    // Text fields
    JTextField t1, tEmail, tPhone;
    JPasswordField t2, t3;

    // Radio buttons
    JRadioButton r1, r2;

    // Check boxes
    JCheckBox c1, c2, c3, cTerms;

    // Combo box
    JComboBox<String> comboCity;

    // Button
    JButton b1;

    // Constructor
    public SwingForm() {
        setTitle("User Registration Form");
        setSize(650, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setComponents();

        setVisible(true);
    }

    // Method to set components
    public void setComponents() {

        // Labels
        l1 = new JLabel("Full Name:");
        l2 = new JLabel("Email:");
        l3 = new JLabel("Phone:");
        l4 = new JLabel("Password:");
        l5 = new JLabel("Confirm Password:");
        l6 = new JLabel("Gender:");
        l7 = new JLabel("Skills:");
        l8 = new JLabel("City:");

        // Text fields
        t1 = new JTextField();
        tEmail = new JTextField();
        tPhone = new JTextField();

        // Password fields
        t2 = new JPasswordField();
        t3 = new JPasswordField();

        // Radio buttons
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Check boxes
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");
        c3 = new JCheckBox("HTML");
        cTerms = new JCheckBox("I agree to Terms & Conditions");

        // Combo box
        String[] cities = {"Select City", "Kathmandu", "Lalitpur", "Bhaktapur"};
        comboCity = new JComboBox<>(cities);

        // Button
        b1 = new JButton("Register");

        // Set bounds
        l1.setBounds(50, 40, 150, 25);   t1.setBounds(220, 40, 250, 25);
        l2.setBounds(50, 80, 150, 25);   tEmail.setBounds(220, 80, 250, 25);
        l3.setBounds(50, 120, 150, 25);  tPhone.setBounds(220, 120, 250, 25);

        l4.setBounds(50, 160, 150, 25);  t2.setBounds(220, 160, 250, 25);
        l5.setBounds(50, 200, 150, 25);  t3.setBounds(220, 200, 250, 25);

        l6.setBounds(50, 240, 150, 25);
        r1.setBounds(220, 240, 80, 25);
        r2.setBounds(310, 240, 100, 25);

        l7.setBounds(50, 280, 150, 25);
        c1.setBounds(220, 280, 80, 25);
        c2.setBounds(310, 280, 90, 25);
        c3.setBounds(410, 280, 80, 25);

        l8.setBounds(50, 320, 150, 25);
        comboCity.setBounds(220, 320, 250, 25);

        cTerms.setBounds(220, 360, 250, 25);
        b1.setBounds(220, 410, 140, 35);

        // Add components
        add(l1); add(t1);
        add(l2); add(tEmail);
        add(l3); add(tPhone);
        add(l4); add(t2);
        add(l5); add(t3);
        add(l6); add(r1); add(r2);
        add(l7); add(c1); add(c2); add(c3);
        add(l8); add(comboCity);
        add(cTerms);
        add(b1);
    }

    // Main method
    public static void main(String[] args) {
        new SwingForm();
    }
}
