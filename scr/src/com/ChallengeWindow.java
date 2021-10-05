package com;

import checkers.ChallengeChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChallengeWindow extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel reto;
    private JTextField respuesta;
    private JButton enviar;
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

        reto = new JLabel(challenge + ". Inserte su respuesta: ");
        reto.setSize(200,200);
        reto.setLocation(100, 50);
        panel.add(reto);

        respuesta = new JTextField(20);
        respuesta.setSize(200,200);
        respuesta.setLocation(100,300);
        panel.add(respuesta);

        enviar = new JButton("Enviar");
        enviar.setSize(100,100);
        enviar.setLocation(150,350);
        enviar.addActionListener(this);
        panel.add(enviar);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == enviar){

            if (respuesta.getText().equals("")){

                JOptionPane.showMessageDialog(null, "Debe insertar un valor");

            } else{

                int num = Integer.parseInt(respuesta.getText());

                //validar la entrada (que no existan caracteres no números)
                //validar que la respuesta sea correcta

            }

        }

    }
}
