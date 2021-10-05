package connection;

import com.Infopack;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {


    @Override
    public void run() {

        try {
            ServerSocket server = new ServerSocket(9090);
            System.out.println("Servidor Inicializado");
            Infopack inPack;
            Socket clientS = server.accept(); //esperando conexion
            //cliente aceptado

            while (true) {

                ObjectInputStream in = new ObjectInputStream(clientS.getInputStream()); //respuesta
                inPack = (Infopack) in.readObject();

                inPack.setRight(inPack.getCorrect() == inPack.getAnswer()); //si responde correcto -->true, else -->false

                System.out.println(inPack.isRight());
                ObjectOutputStream out = new ObjectOutputStream(clientS.getOutputStream());
                out.writeObject(inPack);

                clientS.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

