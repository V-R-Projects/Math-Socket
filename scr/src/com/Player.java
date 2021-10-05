package com;

<<<<<<< HEAD
import Main.Data;

import javax.swing.*;

=======
>>>>>>> parent of c3ce690 (Player)
public class Player {

    public static int x;
    public static int y;

    public Player(){
<<<<<<< HEAD
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

=======
        this.x = 0;
        this.y = 0;
>>>>>>> parent of c3ce690 (Player)
    }

}

