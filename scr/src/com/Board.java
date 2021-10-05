package com;
import dobleList.DoubleList;
import checkers.ChallengeChecker;
import checkers.TrapChecker;
import checkers.TunnelChecker;
import java.util.Random;

public class Board {

    TrapChecker trap;
    TunnelChecker tunnel;
    ChallengeChecker challenge;
    public DoubleList casillas;
    Random random = new Random();
    int tr,tu,ch; //cantidad de casillas de cada tipo
    int x,y; //posicion de las casillas
    int type; //tipo de casilla

    public Board(){
        casillas = new DoubleList();
        tr = 0;
        tu = 0;
        ch = 0;
        x = 50;
        y = 50;

        while (y <= 650){
            type = random.nextInt(3) + 1;

            //creando el tablero de juego

            if(type == 1 && (tr < 5)){
                trap = new TrapChecker();
                casillas.insertLast(trap);
                tr ++;
                x = x + 150;
            }
            else if(type == 2 && (tu < 5)){
                tunnel = new TunnelChecker();
                casillas.insertLast(tunnel);
                tu ++;
                x = x + 150;
            }
            else if(type == 3 && (ch < 10)){
                challenge = new ChallengeChecker();
                casillas.insertLast(challenge);
                ch ++;
                x = x + 150;
            }

            if (x > 500){
                x = 50;
                y = y + 150;
            }
        }
    }
}
