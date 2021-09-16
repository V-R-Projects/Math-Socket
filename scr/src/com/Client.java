package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private static final String ip = "127.0.0.1";
    private static final int puerto = 9090;
    //public static GUI frame;

    public static void main(String[] args) throws IOException {

        //frame = new GUI();

        Socket socket = new Socket(ip, puerto);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("> Indique los datos del producto: valor.porcentaje.peso ");
            String datos = keyboard.readLine();

            if (datos.equals("quit")) break;

            out.println(datos);

            String monto = in.readLine();
            System.out.println("El valor del monto es: " + monto);

        }

        socket.close();

    }
}
