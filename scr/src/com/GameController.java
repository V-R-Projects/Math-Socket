package com;

import Main.Data;
import checkers.*;
import connection.Server;
import dobleList.DoubleList;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Random;

public class GameController {

    private final Home home;
    private GUI Gui;
    private final ArrayList<Checker> initial;
    private static GameController instance;

    public Player player1;
    public Player player2;

    public final DoubleList checkers;

    public GameController() {

        this.player1 = new Player("1");
        this.player2 = new Player("2");

        Runnable server = new Server();
        Thread t = new Thread(server);
        t.start();

        this.home = new Home();
        this.initial = new ArrayList<Checker>(16);
        this.checkers = new DoubleList();
        fillInitial();
        distributeCheckers();

        
    }

    public void play(){

        this.home.setVisible(false);
        this.Gui = new GUI(checkers, player1, player2);
    }

    public void close(){
        this.home.dispose();
        this.Gui.dispose();
    }


    public static GameController get() {
        if (instance == null) instance = new GameController();
        return instance;
    }

    public void distributeCheckers(){
        ArrayList<Integer> numbers = randomArrayList();

        checkers.insertLast(new StartChecker()); // agrega InicioChecker
        for(int i = 1; i < 19; i++){
            int index = numbers.get(i); // random index
            Checker cas = initial.get(index); //get a random Checker
            checkers.insertLast(cas);  // insert a random checker
        }
        checkers.insertLast(new FinalChecker()); // agrega FinalChecker
    }

    private ArrayList<Integer> randomArrayList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(20);
        ArrayList<Integer> randomList = new ArrayList<Integer>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) numbers.add(i);
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(20-i);
            int pos = numbers.get(r);
            numbers.remove(r);
            randomList.add(pos);
        }
        return randomList;
    }

    public void draw(){
        this.Gui.draw();
    }

    public Player getPlayer (){
        if(Data.getInstance().getTurn() % 2 == 1){
            return player2;
        }
        else {
            return player1;
        }
    }

    public Player getOtherPlayer (){
        if(Data.getInstance().getTurn() % 2 == 1){
            return player1;
        }
        else {
            return player2;
        }
    }

    private void fillInitial(){
        for(int i = 0; i < 10; i++){ //amount of challenge checkers
            this.initial.add(new ChallengeChecker());
        }
        for(int i = 0; i < 5; i++){ //amount of challenge checkers
            this.initial.add(new TunnelChecker());
        }
        for(int i = 0; i < 5; i++){ //amount of challenge checkers
            this.initial.add(new TrapChecker());
        }
    }
}
