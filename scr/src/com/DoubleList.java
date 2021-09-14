package com;

public class DoubleList {

    private DoubleNode head;
    public DoubleNode tail;
    private int size = 0;

    public DoubleList(){
        this.head = null;
        this.tail = null;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertLast(int num){
        DoubleNode doubleNode = new DoubleNode(num);
        this.tail.next = doubleNode;
        doubleNode.previous = this.tail;
        doubleNode.next = null;
        this.tail = doubleNode;
        this.size++;
    }

    public void insertFirst(int num){
        this.head = new DoubleNode(num);
        this.tail = this.head;
    }

    public void returnList(){
        DoubleNode current = this.head;
        while (current != null){
            System.out.println(current.getInfo());
            current = current.next;
        }
    }
}
