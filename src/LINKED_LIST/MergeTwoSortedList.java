package LINKED_LIST;

public class MergeTwoSortedList {
    public static void main(String[] args) {
         Node head;
         Node tail;

        int size;

    public MergeTwoSortedList(){
            this.size = 0;
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

