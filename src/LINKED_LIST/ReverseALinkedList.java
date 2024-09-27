package LINKED_LIST;

import java.util.function.Predicate;

public class ReverseALinkedList {


    private Node head;
    private Node tail;

    private int size;
    private ReverseALinkedList next;

    public ReverseALinkedList(){
        this.size = 0;
    }






    //  main function

    public static void reverse (ReverseALinkedList head){
        if (head == null)
            return null;

        if (head.next == null)
            return head;


        ReverseALinkedList previousNode = null;
        ReverseALinkedList CurrentNode = head;


        while(CurrentNode != null){
            ReverseALinkedList NextNode = CurrentNode.next;
            CurrentNode.next = previousNode;
            previousNode = CurrentNode;
            CurrentNode = NextNode;
        }

        head = previousNode;
        System.out.println(head);

    }



    public static void main(String[] args) {

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
