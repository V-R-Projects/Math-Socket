package dobleList;

public class DoubleList {

    public DoubleNode player1;
    public DoubleNode player2;
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleList(){
        this.player1 = null;
        this.player2 = null;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertLast(Object casilla){
        DoubleNode doubleNode = new DoubleNode(casilla);
        doubleNode.previous = this.tail;

        if (this.isEmpty()){ //si esta vacio, toma el nuevo nodo como head
            this.head = doubleNode;

        } else {

            if(this.size == 1){ //si solo contiene un elemento entonces el nodo sera el siguiente del head
                this.head.next = doubleNode;

            }
            this.tail.next = doubleNode; //si no, es el siguiente de la cola
        }
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

    public DoubleNode getHead(){
        if (this.head == null) {
            return null;
        } else {
            return this.head;
        }
    }

    public void moveFoward(int num, int player){
        if(this.player1 == null && this.player2 == null){ //colocando a los jugadores en el inicio
            this.player1 = this.head;
            this.player2 = this.head;
            num --;
        }
        DoubleNode current = null;
        if(player == 1){
            current = this.player1;
        } else {
            current = this.player2;
        }
        while (num > 0){
            if(current.next == null){
                break;
            }
            current = current.next;
            num --;
        }

    }
}
