package LINKED_LIST;


import org.w3c.dom.Node;

public class LinkedListDemo {

    private Node head;
    private Node tail;

    private  int size;



    public LinkedListDemo(){
        this.size = 0;
    }
    public void insertFirstElement(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    private class node {
        private int value;
        private node next;

        public Node(int value){
            this.value = value;
        }
    }

        public Node(int value, int next){
            this.value = value;
            this.next = next;
        }


}
