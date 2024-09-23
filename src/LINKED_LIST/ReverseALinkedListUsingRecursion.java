package LINKED_LIST;

public class ReverseALinkedListUsingRecursion {



    private Node head;
    private Node tail;

    private int size;

    public ReverseALinkedListUsingRecursion(){
        this.size = 0;
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
