package LINKED_LIST;

public class MiddleOfTheLinkedlList {
    private Node head;
    private Node tail;

    private int size;

    public MiddleOfTheLinkedlList(){
        this.size = 0;
    }





    // insert function from sll
    public void insertFirst(int val){
        Node node = new Node(val);   // create a nwe node;
        node.next = head;  //  node => next = head
        head = node; // then this node will be first head

        if (tail == null)
            tail = head; // if tail is a empty then head is equal to tail

        size += 1;    // else size+=1

    }



    //main function
    public Node middle(Node head){
        Node fast = head;
        Node slow = head;

        while
    }

    // display function
    public  void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
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
