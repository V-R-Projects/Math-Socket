package com;

import javax.swing.*;

public class Player {

    public int x;
    public int y;
    public int pos;
    public String name;
    private String img;

    // Rehacer cálculos de grid

    public Player(String name){
        this.name = name;
        this.x = 26;
        this.y = 75;
        this.pos = 0;
    }

    public String getName() {
        return name;
    }

    public void movePlayer(int steps){
        this.x += steps * 137;
        this.pos += steps;
        if(this.pos >= 19){
            this.y = 575;
            this.x = 437;
            JOptionPane.showMessageDialog(null, "Ganaste");
            GameController.get().close();
        }
        if(this.pos < 0){
            this.x = 26;
            this.y = 75;
            this.pos = 0;
        }
        if(this.x > 437){
            this.y += 125;
            this.x -= 548;
        }
        else if(this.x < 26) {
            this.y -= 125;
            this.x += 548;
        }



    }
}
