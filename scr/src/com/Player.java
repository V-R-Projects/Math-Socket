package com;

import javax.swing.*;

public class Player {

    public int x;
    public int y;
    public int pos;
    private String img;

    // Rehacer cálculos de grid

    public Player(){
        this.x = 26;
        this.y = 75;
        this.pos = 0;
    }
    public void movePlayer(int steps){
        this.x += steps * 137;
        this.pos += steps;
        if(this.pos >= 19){
            this.y = 575;
            this.x = 437;
            JOptionPane.showMessageDialog(null, "Ganaste");
        }
        if(this.x > 437){
            this.y += 125;
            this.x -= 548;
        }
        else if(this.x < 26)
        {
            this.y -= 125;
            this.x += 548;
        }

    }
}
