package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    private static final String ip = "127.0.0.1";
    private static final int puerto = 9090;
    //public static GUI frame;

    public Client() throws IOException {
        this.runClient();
    }

    public Client(String s) throws IOException {
        if(s.equals("Server") || s.equals("server")) {
            this.runServer();
        }
        this.runClient();
    }

    public void runServer() throws IOException {

        ServerSocket server = new ServerSocket(puerto);

        while (true) {

            System.out.println("[SERVER] Esperando conexón...");
            Socket client = server.accept();
            System.out.println("[SERVER] Cliente conectado.");
            ClientHandler clientThread = new ClientHandler(client);
            Server.clients.add(clientThread);

            Server.pool.execute(clientThread);

        }
    }

    public void runClient() throws IOException {

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
