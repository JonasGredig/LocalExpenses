package ch.jonasgredig.localexpenses.View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        LayoutManager layout = new BorderLayout();
        setLayout(layout);

        add(new JLabel("Hallo Welt"));

        JTextField textField = new JTextField();
        add(textField);


        setVisible(true);
    }

}
