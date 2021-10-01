package com;

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
    public JTextField player1_field;
    public JTextField player2_field;
    public String player1_name;
    public String player2_name;
    public Font fuente = new Font("Times New Roman", Font.PLAIN, 16);
    public Font fuente_title = new Font("Arial Black", Font.PLAIN, 24);

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

        game_name = new JLabel("Math Socket");
        game_name.setSize(200,200);
        game_name.setLocation(220, 10);
        game_name.setFont(fuente_title);
        panel.add(game_name);

        player1 = new JLabel("Player 1: ");
        player1.setSize(150, 40);
        player1.setLocation(150, 200);
        player1.setFont(fuente);
        panel.add(player1);

        player2 = new JLabel("Player 2: ");
        player2.setSize(150, 40);
        player2.setLocation(150, 300);
        player2.setFont(fuente);
        panel.add(player2);

        player1_field = new JTextField(20);
        player1_field.setSize(150, 40);
        player1_field.setLocation(225, 200);
        panel.add(player1_field);

        player2_field = new JTextField(20);
        player2_field.setSize(150, 40);
        player2_field.setLocation(225, 300);
        panel.add(player2_field);

        setResizable(false);
        panel.repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == play){

            this.player1_name = player1_field.getText();
            this.player2_name = player2_field.getText();

            if (player1_field.getText().equals("") || player2_field.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los jugadores deben tener un nombre");

            } else{
                player1_field.setText(null);
                player2_field.setText(null);

            }

        }

    }
}