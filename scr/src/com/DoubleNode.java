package com;

public class DoubleNode {

    public DoubleNode next;
    public DoubleNode previous;
    private final int info;

    public DoubleNode (int info){
        this.info = info;
    }

    public int getInfo(){
        return this.info;
    }

    public void setNext ( DoubleNode next){
        this.next = next;
    }

    public void setPrevious (DoubleNode previous){
        this.previous = previous;
    }

    public DoubleNode getNext(){
        return this.next;
    }

    public DoubleNode getPrevious(){
        return this.previous;
    }
}

