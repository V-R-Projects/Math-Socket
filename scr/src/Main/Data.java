package Main;

import com.Player;

public class Data {

    private String player1;
    private String player2;
    private static Data instance; //Singleton instance


    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }


}
