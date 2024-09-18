package LINKED_LIST;

public class InsertUsingRecursion {
    private Node head;
    private Node tail;

    private int size;

    public InsertUsingRecursion(){
        this.size = 0;
    }

//     // insert the value using recursion
    public  void insertRecursion(int val, int index){

        head = insertRecursion(val, index, head);
    }

    private  Node insertRecursion(int val, int index, Node node){

        // base case
        if ( index == 0){
            Node temp  = new Node(val, node);
            size++;
            return  temp;
        }

        node.next = insertRecursion(val, index--, node.next);
        return node;

    }


    // insert first function from single linked list
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

    public static void main(String[] args) {
        InsertUsingRecursion list = new InsertUsingRecursion();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertRecursion(3,2);

        list.display();
    }
}
