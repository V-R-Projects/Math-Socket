package com.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    public JPanel panel;
    public JButton play;
    public JLabel player1;
    public JLabel player2;
    public JLabel game_name;
    public JTextField player1_name;
    public JTextField player2_name;

    public Home(){

        setTitle("Math Socket");
        setVisible(true);
        setSize(600,600);
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#c7e6eb"));

        play = new JButton("Play");
        play.setSize(200,50);
        play.setLocation(200, 400);
        play.addActionListener(this);
        panel.add(play);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
