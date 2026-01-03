package chapter2swing;

import javax.swing.*;

public class TableExample extends JFrame {

    public TableExample() {

        // Column names
        String[] columnNames = {"ID", "Name", "Department"};

        // Table data (20 rows)
        String[][] data = {
            {"1", "Ram", "CSIT"},
            {"2", "Sita", "BCA"},
            {"3", "Hari", "BIM"},
            {"4", "Gita", "CSIT"},
            {"5", "Aman", "BCA"},
            {"6", "Nita", "BIM"},
            {"7", "Raju", "CSIT"},
            {"8", "Mina", "BCA"},
            {"9", "Suman", "BIM"},
            {"10", "Anita", "CSIT"},
            {"11", "Ram", "CSIT"},
            {"12", "Sita", "BCA"},
            {"13", "Hari", "BIM"},
            {"14", "Gita", "CSIT"},
            {"15", "Aman", "BCA"},
            {"16", "Nita", "BIM"},
            {"17", "Raju", "CSIT"},
            {"18", "Mina", "BCA"},
            {"19", "Suman", "BIM"},
            {"20", "Anita", "CSIT"}
        };

        // Create JTable
        JTable table = new JTable(data, columnNames);

        // Add table to JScrollPane
        JScrollPane sp = new JScrollPane(table);

        // Add scroll pane to frame
        add(sp);

        // Frame settings
        setTitle("JTable Example");
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
