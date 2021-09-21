package com;

public class DoubleNode {

    public DoubleNode next;
    public DoubleNode previous;
    private final Object info;

    public DoubleNode (Object info){
        this.info = info;
    }

    public Object getInfo(){
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

