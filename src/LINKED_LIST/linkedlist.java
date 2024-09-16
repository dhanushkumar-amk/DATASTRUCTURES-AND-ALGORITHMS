package LINKED_LIST;

public class linkedlist {


    private  Node head;
    private Node tail;

    private int size;

    public linkedlist(){
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

    // display function
    public  void display(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp + " -> ");
            temp = temp.next;
        }

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
