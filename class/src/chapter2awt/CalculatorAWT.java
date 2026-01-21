package chapter2awt;

import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {

    TextField display;
    Button[] num = new Button[10];
    Button add, sub, mul, div, eq, dot;
    Button back, c, ce, sqrt, percent, inv, sign;
    Button mc, mr, ms, mPlus;

    double memory = 0;
    StringBuilder input = new StringBuilder(); // stores full input

    public CalculatorAWT() {

        setTitle("Full Display Calculator");
        setSize(400, 500);
        setLayout(null);

        // Display
        display = new TextField();
        display.setBounds(20, 40, 360, 50);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display);

        int w = 60, h = 50, x = 20, y = 100, gap = 10;

        // Memory buttons
        mc = new Button("MC");
        mr = new Button("MR");
        ms = new Button("MS");
        mPlus = new Button("M+");
        mc.setBounds(x, y, w, h);
        mr.setBounds(x + (w + gap), y, w, h);
        ms.setBounds(x + 2 * (w + gap), y, w, h);
        mPlus.setBounds(x + 3 * (w + gap), y, w, h);
        add(mc); add(mr); add(ms); add(mPlus);

        y += h + gap;

        // Function buttons
        back = new Button("Back");
        c = new Button("C");
        ce = new Button("CE");
        sqrt = new Button("√");
        back.setBounds(x, y, w, h);
        c.setBounds(x + (w + gap), y, w, h);
        ce.setBounds(x + 2 * (w + gap), y, w, h);
        sqrt.setBounds(x + 3 * (w + gap), y, w, h);
        add(back); add(c); add(ce); add(sqrt);

        y += h + gap;

        // Operators and special functions
        div = new Button("/");
        mul = new Button("*");
        sub = new Button("-");
        add = new Button("+");
        eq = new Button("=");
        dot = new Button(".");
        percent = new Button("%");
        inv = new Button("1/x");
        sign = new Button("±");

        // Number buttons layout
        int numX = x, numY = y + h + gap;
        int n = 7;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                num[n] = new Button(String.valueOf(n));
                num[n].setBounds(numX + col * (w + gap), numY + row * (h + gap), w, h);
                num[n].addActionListener(this);
                add(num[n]);
                n++;
            }
            n -= 6;
        }
        // 0 button
        num[0] = new Button("0");
        num[0].setBounds(numX + (w + gap), numY + 3 * (h + gap), w, h);
        num[0].addActionListener(this);
        add(num[0]);

        // Dot button
        dot.setBounds(numX, numY + 3 * (h + gap), w, h);
        add(dot);
        dot.addActionListener(this);

        // Equals button
        eq.setBounds(numX + 2 * (w + gap), numY + 3 * (h + gap), w, h);
        add(eq);
        eq.addActionListener(this);

        // Operators
        add.setBounds(numX + 3 * (w + gap), numY + 2 * (h + gap), w, h);
        sub.setBounds(numX + 3 * (w + gap), numY + (h + gap), w, h);
        mul.setBounds(numX + 3 * (w + gap), numY, w, h);
        div.setBounds(numX + 3 * (w + gap), numY - (h + gap), w, h);
        add(add); add(sub); add(mul); add(div);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Other functions
        percent.setBounds(numX + 3 * (w + gap), numY + 3 * (h + gap), w, h);
        inv.setBounds(numX + 2 * (w + gap), numY, w, h);
        sign.setBounds(numX, numY, w, h); 
        add(percent); add(inv); add(sign);
        percent.addActionListener(this);
        inv.addActionListener(this);
        sign.addActionListener(this);

        // Memory buttons listeners
        mc.addActionListener(this);
        mr.addActionListener(this);
        ms.addActionListener(this);
        mPlus.addActionListener(this);

        // Function buttons
        back.addActionListener(this);
        c.addActionListener(this);
        ce.addActionListener(this);
        sqrt.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();

        // Number buttons
        for (int i = 0; i <= 9; i++) {
            if (src == num[i]) {
                input.append(i);
                display.setText(input.toString());
                return;
            }
        }

        // Dot
        if (src == dot) {
            if (!input.toString().endsWith(".") && !input.toString().contains(".")) {
                input.append(".");
            }
            display.setText(input.toString());
        }

        // Operators: append
        if (src == add) input.append("+");
        if (src == sub) input.append("-");
        if (src == mul) input.append("*");
        if (src == div) input.append("/");
        display.setText(input.toString());

        // Backspace
        if (src == back && input.length() > 0) {
            input.deleteCharAt(input.length() - 1);
            display.setText(input.toString());
        }

        // Clear / CE
        if (src == c || src == ce) {
            input.setLength(0);
            display.setText("");
        }

        // Equals: simple eval for one operator
        if (src == eq) {
            try {
                String expr = input.toString();
                double result = eval(expr);
                display.setText(String.valueOf(result));
                input.setLength(0);
            } catch (Exception ex) {
                display.setText("Error");
                input.setLength(0);
            }
        }

        // Memory
        if (src == ms) memory = getDisplay();
        if (src == mr) display.setText(String.valueOf(memory));
        if (src == mc) memory = 0;
        if (src == mPlus) memory += getDisplay();

        // Other functions
        if (src == sign) display.setText(String.valueOf(-getDisplay()));
        if (src == inv) display.setText(String.valueOf(1 / getDisplay()));
        if (src == sqrt) display.setText(String.valueOf(Math.sqrt(getDisplay())));
        if (src == percent) display.setText(String.valueOf(getDisplay() / 100));
    }

    double getDisplay() {
        String text = display.getText();
        if (text.equals("")) return 0;
        return Double.parseDouble(text);
    }

    double eval(String expr) {
        // Handles simple expressions with one operator like 9+8, 7*3
        if (expr.contains("+")) {
            String[] parts = expr.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (expr.contains("-")) {
            String[] parts = expr.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (expr.contains("/")) {
            String[] parts = expr.split("/");
            return Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        }
        return Double.parseDouble(expr);
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
