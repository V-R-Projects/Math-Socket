package com;

import Main.Data;

import javax.swing.*;

public class Player {

    public int x;
    public int y;
    private int pos;
    private String img;

    public Player(){
        this.x = 26;
        this.y = 75;
        this.pos = 0;
    }
    public void movePlayer(int steps) {
        this.pos += steps;
        if (this.pos >= 15) {
            this.y = 450;
            this.x = 437;
            JOptionPane.showMessageDialog(null, "Ganaste");
        }

        for(int i = 0; i < steps; i++) {
            this.x += 137;

            if (this.x > 437) {
                this.y += 125;
                this.x -= 548;
            }



        }

    }

}

