package connection;


import com.Infopack;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private boolean right;
    public static Socket clientReciever;

    public void Client_start(){
        try {
            Infopack inPack;

            while (true) {
                ObjectInputStream in = new ObjectInputStream(clientReciever.getInputStream());
                inPack = (Infopack) in.readObject();
                right = inPack.isRight();
                clientReciever.close();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void send (int correct, int answer){
        try {
            Socket clientReciever = new Socket("127.0.0.1", 9090);
            Infopack num = new Infopack();
            num.setCorrect(correct);
            num.setAnswer(answer);
            ObjectOutputStream out = new ObjectOutputStream(clientReciever.getOutputStream());
            out.writeObject(num);
            clientReciever.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setRight(boolean right){
        this.right = right;
    }
    public boolean isRight(){
        return right;
    }
}
