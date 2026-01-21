package chapter2swing;

import javax.swing.*;

public class InternalFrameExample {

    public static void main(String[] args) {

        //Create main JFrame
        JFrame mainFrame = new JFrame("JInternalFrame Example");

        // Set frame size and default close operation
        mainFrame.setSize(500, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create JDesktopPane
        JDesktopPane desktopPane = new JDesktopPane();

        // Add desktop pane to main frame
        mainFrame.add(desktopPane);

        // 3. Create JInternalFrame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);

        // Set size and visibility of internal frame
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);

        // 4. Add a JLabel inside internal frame
        JLabel label = new JLabel("This is an internal frame");
        label.setBounds(50, 50, 200, 30);
        internalFrame.add(label);

        // 5. Add internal frame to desktop pane
        desktopPane.add(internalFrame);

        // Set main frame visible
        mainFrame.setVisible(true);
    }
}
