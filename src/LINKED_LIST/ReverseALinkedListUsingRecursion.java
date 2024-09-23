package LINKED_LIST;

public class ReverseALinkedListUsingRecursion {
    public static void main(String[] args) {

        ReverseALinkedListUsingRecursion list = new ReverseALinkedListUsingRecursion();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

    }



    private Node head;
    private Node tail;

    private int size;

    public ReverseALinkedListUsingRecursion(){
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

    // reverse a linkedList

    public  void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
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
