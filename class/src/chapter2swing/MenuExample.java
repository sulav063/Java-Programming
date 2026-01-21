/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2swing;

/**
 *
 * @author Sulav
 */
import javax.swing.*;
public class MenuExample {
 JFrame frame;
    JMenuBar menuBar;
    JMenu menu, electiveMenu;
    JMenuItem javaItem, pomItem, dwdmItem;
    JMenuItem spmItem, ipItem, mlItem;

    // Constructor
    public MenuExample() {

        // Create Frame
        frame = new JFrame("ACHS College");

        // Create Menu Bar
        menuBar = new JMenuBar();

        // Create Menu
        menu = new JMenu("Menu");

        // Menu Items
        javaItem = new JMenuItem("Java");
        pomItem = new JMenuItem("POM");
        dwdmItem = new JMenuItem("DWDM");

        // Add items to Menu
        menu.add(javaItem);
        menu.add(pomItem);
        menu.add(dwdmItem);

        // Create Submenu
        electiveMenu = new JMenu("Elective");

        // Submenu Items
        spmItem = new JMenuItem("SPM");
        ipItem = new JMenuItem("Image Processing");
        mlItem = new JMenuItem("ML");

        // Add items to Submenu
        electiveMenu.add(spmItem);
        electiveMenu.add(ipItem);
        electiveMenu.add(mlItem);

        // Add Submenu to Menu
        menu.add(electiveMenu);

        // Add Menu to MenuBar
        menuBar.add(menu);

        // Set MenuBar to Frame
        frame.setJMenuBar(menuBar);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Main Method
    public static void main(String[] args) {
        new MenuExample();
    }
}
