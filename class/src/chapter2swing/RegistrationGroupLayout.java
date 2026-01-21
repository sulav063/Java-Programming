package chapter2swing;

import javax.swing.*;
import java.awt.*;

public class RegistrationGroupLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");

        // ✅ Force Swing JPanel
        javax.swing.JPanel panel = new javax.swing.JPanel();

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel lblTitle = new JLabel("User Registration");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));

        JLabel lblName = new JLabel("Full Name:");
        JTextField txtName = new JTextField(15);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(15);

        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(15);

        JButton btnRegister = new JButton("Register");
        JButton btnClear = new JButton("Clear");

        // Horizontal
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblTitle)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblName)
                        .addComponent(lblEmail)
                        .addComponent(lblPassword))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txtName)
                        .addComponent(txtEmail)
                        .addComponent(txtPassword)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnRegister)
                    .addComponent(btnClear))
        );

        // Vertical
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClear))
        );

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
