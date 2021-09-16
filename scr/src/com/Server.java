package com;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static final ArrayList<ClientHandler> clients = new ArrayList<>();
    public static final ExecutorService pool = Executors.newFixedThreadPool(2);


}
