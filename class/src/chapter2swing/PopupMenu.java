package chapter2swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PopupMenu {

    public PopupMenu() {

        // Final JFrame
        final JFrame f = new JFrame("Popup Menu");

        // Final JLabel
        final JLabel label = new JLabel("Right click anywhere", JLabel.CENTER);
        label.setPreferredSize(new Dimension(400, 100));

        // Final Popup Menu
        final JPopupMenu popupMenu = new JPopupMenu("Edit");

        // Menu items
        final JMenuItem cut = new JMenuItem("Cut");
        final JMenuItem copy = new JMenuItem("Copy");
        final JMenuItem paste = new JMenuItem("Paste");

        // Add items to popup menu
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        // Mouse listener
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                // Show popup menu on right click
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupMenu.show(f, e.getX(), e.getY());
                }

                // Cut action
                cut.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        label.setText("Cut selected");
                    }
                });

                // Copy action
                copy.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        label.setText("Copy selected");
                    }
                });

                // Paste action
                paste.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        label.setText("Paste selected");
                    }
                });
            }
        });

        // Add label
        f.add(label);

        // Frame settings
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new PopupMenu();
    }
}
