package chapter2swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame f = new JFrame("JSlider Example");

        // Create JLabel to show slider value
        JLabel valueLabel = new JLabel("Value: 50");
        valueLabel.setBounds(50, 50, 100, 30);

        // Create JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // min=0, max=100, initial=50

        // Set bounds
        slider.setBounds(50, 100, 300, 50);

        // Set major and minor ticks
        slider.setMajorTickSpacing(20);   // Major tick every 20
        slider.setMinorTickSpacing(5);    // Minor tick every 5

        // Paint ticks and labels
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add ChangeListener
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int level = slider.getValue();
                valueLabel.setText("Value: " + level); // update label
            }
        });

        // Add components to frame
        f.add(slider);
        f.add(valueLabel);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
