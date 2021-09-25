package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUI extends JFrame implements ActionListener{

    public JPanel panel;
    public JButton dado;
    public JLabel labeldado;
    public int dado_result;
    public Font fuente = new Font("Times New Roman", Font.PLAIN, 16);

    public GUI (){

        this.printPanel();

    }

    public void printPanel(){

        setTitle("MathSocket");
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

        labeldado = new JLabel("");
        labeldado.setSize(60,40);
        labeldado.setLocation(120,25);
        labeldado.setFont(fuente);
        panel.add(labeldado);

        panel.repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random num_dado = new Random();
        dado_result = 1 + num_dado.nextInt(4);
        labeldado.setText(String.valueOf(dado_result));
    }
}
