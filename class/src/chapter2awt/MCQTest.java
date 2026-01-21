package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class MCQTest extends Frame implements ActionListener {

    Label question;
    CheckboxGroup group;
    Checkbox c1, c2, c3, c4;
    Button next, exit;
    int count = 0;

    public MCQTest() {

        setTitle("Simple MCQ Test");
        setSize(400, 300);
        setLayout(null);

        question = new Label();
        question.setBounds(50, 50, 300, 20);
        add(question);

        group = new CheckboxGroup();

        c1 = new Checkbox("", group, false);
        c2 = new Checkbox("", group, false);
        c3 = new Checkbox("", group, false);
        c4 = new Checkbox("", group, false);

        c1.setBounds(60, 80, 200, 20);
        c2.setBounds(60, 110, 200, 20);
        c3.setBounds(60, 140, 200, 20);
        c4.setBounds(60, 170, 200, 20);

        add(c1);
        add(c2);
        add(c3);
        add(c4);

        next = new Button("Next");
        exit = new Button("Exit");

        next.setBounds(80, 210, 80, 30);
        exit.setBounds(200, 210, 80, 30);

        add(next);
        add(exit);

        next.addActionListener(this);
        exit.addActionListener(this);

        loadQuestion1();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    void loadQuestion1() {
        question.setText("Q1: Which is your favourite political party?");
        c1.setLabel("RSP");
        c2.setLabel("Nepali Congress");
        c3.setLabel("RPP");
        c4.setLabel("UML");
        group.setSelectedCheckbox(null);
    }

    void loadQuestion2() {
        question.setText("Q2: Who is your favourite politician?");
        c1.setLabel("Balen");
        c2.setLabel("KP Oli");
        c3.setLabel("Prachanda");
        c4.setLabel("Gagan Thapa");
        group.setSelectedCheckbox(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == next) {
            count++;
            if (count == 1) {
                loadQuestion2();
            } else {
                dispose(); // close after second question
            }
        }

        if (e.getSource() == exit) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new MCQTest();
    }
}
