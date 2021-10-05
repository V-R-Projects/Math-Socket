package com;

import Main.Data;
import checkers.ChallengeChecker;
import checkers.Checker;
import connection.Client;
import connection.Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChallengeWindow extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel reto;
    private JTextField respuesta;
    private JButton enviar;
    private Client cliente;
    private int num;
    private final Font fuente = new Font("Times New Roman", Font.PLAIN, 16);

    public ChallengeWindow(String challenge){

        setTitle("Reto");
        setVisible(true);
        setSize(400,500);
        setResizable(false);
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#c7e6eb"));

        String name = "";

        if(GameController.get().getOtherPlayer().getName() == "1") {
             name = Data.getInstance().getNamePlayer1();
        }
        else {
             name = Data.getInstance().getNamePlayer2();
        }

        reto = new JLabel("Jugador: " + name +" Reto: " + challenge + ". Inserte su respuesta: ");
        reto.setSize(400,200);
        reto.setLocation(0, 50);
        reto.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(reto);



        respuesta = new JTextField(20);
        respuesta.setSize(100,25);
        respuesta.setLocation(150,200);
        panel.add(respuesta);

        enviar = new JButton("Enviar");
        enviar.setSize(100,50);
        enviar.setLocation(150,275);
        enviar.addActionListener(this);
        panel.add(enviar);

        this.cliente = new Client();

    }

    public void valida(boolean ans){
        System.out.println(ans);
        if (ans) {
            JOptionPane.showMessageDialog(null, "La respuesta es correcta");
        } else {
            JOptionPane.showMessageDialog(null, "La respuesta es incorrecta");
            GameController.get().getPlayer().movePlayer(-1);
        }
        GameController.get().getOtherPlayer().movePlayer(1);

        GameController.get().draw();

        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == enviar){

            if (respuesta.getText().equals("")){

                JOptionPane.showMessageDialog(null, "Debe insertar un valor");

            } else { //validar entrada

                Object num = Float.parseFloat(respuesta.getText());
                //Object answer = num;
                this.cliente.send(num);
                System.out.println("Enviado");


            }

            }

        }

    }

