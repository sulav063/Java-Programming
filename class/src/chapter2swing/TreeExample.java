package chapter2swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame f = new JFrame("JTree Example");

        // Create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create folder nodes
        DefaultMutableTreeNode folder1 = new DefaultMutableTreeNode("Folder1");
        DefaultMutableTreeNode folder2 = new DefaultMutableTreeNode("Folder2");

        // Create file nodes for Folder1
        DefaultMutableTreeNode file1 = new DefaultMutableTreeNode("File1");
        DefaultMutableTreeNode file2 = new DefaultMutableTreeNode("File2");

        // Add files to folder1
        folder1.add(file1);
        folder1.add(file2);

        // Add folders to root
        root.add(folder1);
        root.add(folder2);

        // Create JTree with root
        JTree tree = new JTree(root);

        // Add tree to scroll pane
        JScrollPane sp = new JScrollPane(tree);

        // Add scroll pane to frame
        f.add(sp);

        // Frame settings
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
