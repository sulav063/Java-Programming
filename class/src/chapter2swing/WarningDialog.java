package chapter2swing;

import javax.swing.*;

public class WarningDialog {

    JFrame f;

    WarningDialog() {
        // Create JFrame
        f = new JFrame();

        // Show warning dialog
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new WarningDialog();
    }
}
