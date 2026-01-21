package chapter2swing;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class CardLayoutRegister {

    JFrame frame;
    javax.swing.JPanel mainCardPanel;  // renamed to avoid conflict
    CardLayout cardLayout;

    public CardLayoutRegister() {

        // Create frame
        frame = new JFrame("Registration Form");

        // CardLayout manager
        cardLayout = new CardLayout();
        mainCardPanel = new javax.swing.JPanel(cardLayout); // use fully qualified JPanel

        Font font = new Font("Segoe UI", Font.PLAIN, 14);

        // ---------- Card 1 ----------
        javax.swing.JPanel cardPanel1 = new javax.swing.JPanel(new GridLayout(4, 2, 10, 10));

        JLabel lblName = new JLabel("Full Name:");
        JTextField txtName = new JTextField(15);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(15);

        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(15);

        JButton btnNext = new JButton("Next");

        // Set fonts and preferred sizes
        txtName.setFont(font);
        txtEmail.setFont(font);
        txtPassword.setFont(font);
        btnNext.setFont(font);

        txtName.setPreferredSize(new Dimension(160, 25));
        txtEmail.setPreferredSize(new Dimension(160, 25));
        txtPassword.setPreferredSize(new Dimension(160, 25));
        btnNext.setPreferredSize(new Dimension(80, 25));

        // Add components to cardPanel1
        cardPanel1.add(lblName);
        cardPanel1.add(txtName);
        cardPanel1.add(lblEmail);
        cardPanel1.add(txtEmail);
        cardPanel1.add(lblPassword);
        cardPanel1.add(txtPassword);
        cardPanel1.add(new JLabel("")); // empty cell
        cardPanel1.add(btnNext);


        // ---------- Button Action ----------
        btnNext.addActionListener(e -> cardLayout.next(mainCardPanel));

        // ---------- Add cards to main panel ----------
        mainCardPanel.add(cardPanel1, "Card1");

        // ---------- Add main panel to frame ----------
        frame.add(mainCardPanel);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center frame
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new CardLayoutRegister();
    }
}
