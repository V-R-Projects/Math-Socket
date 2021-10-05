package com;

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
    private Imagen img;
    private int numDado;
    private final Font fuente;

<<<<<<< HEAD
    private GUI instance;

    public GUI (DoubleList checkers, Player player1, Player player2){
=======
    public GUI (DoubleList checkers){
>>>>>>> parent of c3ce690 (Player)

        this.fuente = new Font("Times New Roman", Font.PLAIN, 16);
        printPanel(checkers);

    }

    public void printPanel(DoubleList checkers){

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

        int i = 0;
        for (int y = 75; y <= 450; y += 125) {
            for (int x = 26; x <= 437; x += 137) {
                img = new Imagen(checkers.get(i));
                img.setLocation(x, y);
                panel.add(img);
                i++;
            }
        }

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
<<<<<<< HEAD
        //Data.getInstance().setDado(numDado);
        dado.setEnabled(false);
        for (int i = 0; i < numDado; i++) {

            player1.movePlayer(1);
            draw();
            System.out.println("dibujado");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
        dado.setEnabled(true);
=======
>>>>>>> parent of c3ce690 (Player)
    }
}
