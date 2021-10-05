package Main;

public class Data {

    private String namePlayer1;
    private String namePlayer2;
    private int dado;
    private int turn;
    private static Data instance; //Singleton instance


    public static Data getInstance() {
        if (instance == null) instance = new Data();
        return instance;
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getTurn() {
        return turn;
    }

    public void addTurn() {
        this.turn ++;
    }
}
