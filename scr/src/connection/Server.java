package connection;

import com.Infopack;

import Main.Data;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server implements Runnable {



    @Override
    public void run() {

        try {
            ServerSocket server = new ServerSocket(9090);
            System.out.println("Servidor Inicializado");

            while (true) {

                Socket clientS = server.accept(); //esperando conexion
                System.out.println("Cliente conectado");

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

    public static String crearReto(){

        String ops = "+-*/";
        Random random = new Random();
        n1 = random.nextInt(51);
        n2 = 1 + random.nextInt(50);
        op = random.nextInt(4);
        reto = Integer.toString(n1) + ops.charAt(op) + Integer.toString(n2);

        return reto;
    }

    public static Object resolverReto(){

        return switch (op) {
            case 0 -> (float) (n1 + n2);
            case 1 -> (float) (n1 - n2);
            case 2 -> (float) (n1 * n2);
            case 3 -> (float) n1 / (float) n2;
            default -> -1.0;
        };

    }

}

