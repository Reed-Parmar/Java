package GUI_development;

import javax.swing.*;

public class Greeting {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting Application");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel lblGreeting = new JLabel("Hello World!");
    }
}
