package LINKED_LIST;

public class ll {

    private  Node head;
    private Node tail;

    private int size;

    public ll (){
        this.size = 0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);   // create a nwe node;
        node.next = head;  //  node => next = head
        head = node; // then this node will be first head

        if (tail == null)
            tail = head; // if tail is a empty then head is equal to tail

        size += 1;    // else size+=1

    }


    // insert the value in last index
    public  void insertLast(int val){

        if (tail == null){
            insertFirst(val);
            return;
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }

    // insert the element in particular index

    public void  insert(int val, int index ){
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp  =  temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next = node;
        size++;

    }


    // display function
    public  void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("end");

    }





    private  class Node{
        private int value;
        private Node next;

        public  Node(int value){
            this.value = value;
        }

        public  Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
