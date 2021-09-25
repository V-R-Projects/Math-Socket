package connection;

import com.Infopack;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main (String[] args){

        try {
            int port = 9090;
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor Inicializado");
            Infopack inPack;

            while (true){
                Socket clientS = server.accept(); //esperando conexion
                ObjectInputStream in = new ObjectInputStream(clientS.getInputStream());
                inPack = (Infopack) in.readObject();

                inPack.setRight(inPack.getCorrect() == inPack.getAnswer());

                System.out.println(inPack.isRight());
                Socket output= new Socket("127.0.0.1", 8080);
                ObjectOutputStream out = new ObjectOutputStream(output.getOutputStream());
                out.writeObject(inPack);

                clientS.close();
                output.close();
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
