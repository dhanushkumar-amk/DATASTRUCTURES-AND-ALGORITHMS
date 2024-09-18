package LINKED_LIST;

import java.util.LinkedList;

public class RemoveDuplicatesFomSortedList {
    private Node head;
    private Node tail;

    private int size;

    public RemoveDuplicatesFomSortedList(){
        this.size = 0;
    }

    public static void main(String[] args) {
    }




    public void removeDuplicates(){
        Node node = head;

        while (node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else
                node = node.next;

        }
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
