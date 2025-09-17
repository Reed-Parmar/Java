package GUI_development;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI{
    public static void main(String[] args) {
        //Create the frame
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a label
        JLabel label = new JLabel("Hello world",SwingConstants.CENTER);
        //create a button
        JButton button = new JButton("Click me");
        //action for button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button was clicked");
            }
        });
        //create a back button
        JButton back = new JButton("back button");
        //action for back button
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Back button was clicked");
            }
        });


        //add components
        frame.setLayout(new java.awt.BorderLayout());
        frame.add(label, java.awt.BorderLayout.CENTER);
        frame.add(button, java.awt.BorderLayout.SOUTH);
        frame.add(back, java.awt.BorderLayout.EAST);

        //show the window
        frame.setVisible(true);
    }
}