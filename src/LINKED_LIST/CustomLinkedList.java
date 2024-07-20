package LINKED_LIST;

public class CustomLinkedList {

    private  Node head;
    private  Node tail;
    private int size;

    public  CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node  = new Node(val);

        // if we add the value in the front of the linked list then assign the value of head to the inserted element
        node.next = head;
        head = node;

        // tail has value of null then its the point of head
        if(tail == null){
            tail = head;
        }
        // then increase the size
        size +=1;
    }

    // display
    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
