package com.groupG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library {
    private JButton button;
    private JPanel panel1;

    public Library() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Welcome to the Library");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Library");
        frame.setContentPane(new Library().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
