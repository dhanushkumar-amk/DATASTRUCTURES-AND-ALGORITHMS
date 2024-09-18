package LINKED_LIST;

import java.util.LinkedList;

public class RemoveDuplicatesFomSortedList {
    private static Node head;
    private static Node tail;

    private static int size;

    public RemoveDuplicatesFomSortedList(){
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

//        RemoveDuplicatesFomSortedList ll = new RemoveDuplicatesFomSortedList();

        list.add(5);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(3);



        System.out.println(list);



    }




    public static void removeDuplicates(){
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

// display function
    public  void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("end");

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