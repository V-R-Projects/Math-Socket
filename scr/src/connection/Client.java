package connection;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private boolean right;
    private Object entrada;
    private Object salida;
    public Socket clientReciever;

    public Client(){
        try {
            clientReciever = new Socket("127.0.0.1",9090);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void recieve(){
        try {

            ObjectInputStream in = new ObjectInputStream(clientReciever.getInputStream());
            entrada = in.readObject();
            //clientReciever.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void send(Object num){
        try {
            ObjectOutputStream out = new ObjectOutputStream(clientReciever.getOutputStream());
            out.writeObject(num);
            System.out.println();
            //clientReciever.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
