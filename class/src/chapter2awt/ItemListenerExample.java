package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample
        implements ItemListener, WindowListener {

    Frame f;
    Checkbox c1, c2;
    Label l;

    public ItemListenerExample() {
        f = new Frame("ItemListener Example");

        l = new Label();
        l.setBounds(100, 50, 200, 30);

        c1 = new Checkbox("Java");
        c1.setBounds(100, 100, 80, 30);

        c2 = new Checkbox("C++");
        c2.setBounds(100, 150, 80, 30);

        c1.addItemListener(this);
        c2.addItemListener(this);

        f.add(l);
        f.add(c1);
        f.add(c2);

        f.addWindowListener(this);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox cb = (Checkbox) e.getSource();
        l.setText(cb.getLabel() + " Selected");
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
