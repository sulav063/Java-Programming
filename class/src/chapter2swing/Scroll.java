package chapter2swing;

import javax.swing.*;

public class Scroll {
    public static void main(String[] args) {

        // Create JFrame object
        JFrame f = new JFrame("Scrollbar Example");

        // Create JScrollBar
        JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL);

        // setBounds(x, y, width, height)
        sb.setBounds(100, 10, 50, 100);

        // Add scrollbar to frame
        f.add(sb);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
