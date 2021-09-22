package com;

import java.io.Serializable;

public class Infopack implements Serializable {

    private int answer, correct;
    private boolean right;

    public boolean isRight(){
        return right;
    }

    public int getCorrect(){
        return correct;
    }

    public int getAnswer(){
        return answer;
    }

    public void setRight(boolean right){
        this.right = right;
    }

    public void setCorrect(int correct){
        this.correct = correct;
    }

    public void setAnswer(int answer){
        this.answer = answer;
    }
}
