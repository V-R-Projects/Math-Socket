package com;

import Main.Data;
import checkers.ChallengeChecker;
import checkers.Checker;
import checkers.TrapChecker;
import checkers.TunnelChecker;
import dobleList.DoubleList;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Random;

public class GameController {

    private final Home home;
    private final GUI Gui;
    private final ArrayList<Checker> initial;
    private static GameController instance;

    private final DoubleList checkers;

    public GameController() {
        this.home = new Home();
        this.initial = new ArrayList<Checker>(16);
        this.checkers = new DoubleList();
        fillInitial();
        distributeCheckers();
        this.Gui = new GUI(checkers);
        this.Gui.setVisible(false);
        
    }

    public void play(){
        this.home.setVisible(false);
        this.Gui.setVisible(true);
    }


    public static GameController get() {
        if (instance == null) instance = new GameController();
        return instance;
    }

    public void distributeCheckers(){
        ArrayList<Integer> numbers = randomArrayList();
        for(int i = 0; i < 16; i++){
            checkers.insertLast(initial.get(numbers.get(i)));
        }
    }

    private ArrayList<Integer> randomArrayList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(16);
        ArrayList<Integer> randomList = new ArrayList<Integer>(16);
        Random random = new Random();
        for (int i = 0; i < 16; i++) numbers.add(i);
        for (int i = 0; i < 16; i++) {
            int r = random.nextInt(16-i);
            int pos = numbers.get(r);
            numbers.remove(r);
            randomList.add(pos);
        }
        return randomList;
    }

    private final void fillInitial(){
        for(int i = 0; i < 8; i++){ //amount of challenge checkers
            this.initial.add(new ChallengeChecker());
        }
        for(int i = 0; i < 4; i++){ //amount of challenge checkers
            this.initial.add(new TunnelChecker());
        }
        for(int i = 0; i < 4; i++){ //amount of challenge checkers
            this.initial.add(new TrapChecker());
        }
    }
}
