package com;

import Main.Data;
import checkers.Checker;
import checkers.Imagen;
import dobleList.DoubleList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUI extends JFrame implements ActionListener{


    private JPanel panel;
    private JButton dado;
    private JLabel labelDado;
    private JLabel labelplayers;
    private Imagen img;
    private Imagen P1;
    private Imagen P2;
    private Player player1;
    private Player player2;
    private int numDado;
    private final Font fuente;

    public GUI (DoubleList checkers, Player player1, Player player2){

        this.fuente = new Font("Times New Roman", Font.PLAIN, 16);
        this.player1 = player1;
        this.player2 = player2;
        printPanel(checkers);

    }

    public void printPanel(DoubleList checkers){

        setTitle("Math Socket");
        setVisible(true);
        setSize(600,800);
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

        labelplayers = new JLabel("Player 1: " + Data.getInstance().getNamePlayer1() + "   Player 2: "+ Data.getInstance().getNamePlayer2());
        labelplayers.setSize(500, 40);
        labelplayers.setLocation(180, 25);
        labelplayers.setFont(fuente);
        panel.add(labelplayers);

        int i = 0;
        for (int y = 75; y <= 575; y += 125) {
            for (int x = 26; x <= 437; x += 137) {
                img = new Imagen(checkers.get(i));
                img.setLocation(x, y);
                panel.add(img);
                i++;
            }
        }

        P1 = new Imagen("Player_1.png");
        P1.setLocation(player1.x, player1.y);
        panel.add(P1);
        panel.setComponentZOrder(P1, 1);

        P2 = new Imagen("Player_2.png");
        P2.setLocation(player2.x, player2.y);
        panel.add(P2);
        panel.setComponentZOrder(P2, 1);

        panel.repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void draw() {
        P1.setLocation(player1.x, player1.y);
        P2.setLocation(player2.x, player2.y);
        panel.repaint();
    }

    public int getNumDado() {
        return numDado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random num_dado = new Random();
        numDado = 1 + num_dado.nextInt(4);
        labelDado.setText(String.valueOf(numDado));
        //Data.getInstance().setDado(numDado);
        GameController.get().getPlayer().movePlayer(numDado);
        this.draw();
        if(GameController.get().getPlayer().pos<19) {
            Checker cas = GameController.get().checkers.getCheck(GameController.get().getPlayer().pos);
            cas.act();
        }
        Data.getInstance().addTurn();

    }
}
