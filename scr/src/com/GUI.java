package com;

import checkers.Imagen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUI extends JFrame implements ActionListener{

    private JPanel panel;
    private JButton dado;
    private JLabel labelDado;
    private Imagen img;
    private int numDado;
    private final Font fuente = new Font("Times New Roman", Font.PLAIN, 16);

    public GUI (){

        this.printPanel();

    }

    public void printPanel(){

        setTitle("Math Socket");
        setVisible(true);
        setSize(600,600);
        setResizable(false);
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#c7e6eb"));

        dado = new JButton("Dado");
        dado.setSize(80,40);
        dado.setLocation(25,25);
        dado.addActionListener(this);
        panel.add(dado);

        labelDado = new JLabel("");
        labelDado.setSize(60,40);
        labelDado.setLocation(120,25);
        labelDado.setFont(fuente);
        panel.add(labelDado);

        img = new Imagen("ChallengeChecker.png");
        img.setLocation(26,75);
        panel.add(img);

        panel.repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public int getNumDado() {
        return numDado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random num_dado = new Random();
        numDado = 1 + num_dado.nextInt(4);
        labelDado.setText(String.valueOf(numDado));
    }
}
