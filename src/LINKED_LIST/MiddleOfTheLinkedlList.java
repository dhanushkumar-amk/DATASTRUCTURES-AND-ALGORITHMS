package LINKED_LIST;

public class MiddleOfTheLinkedlList {
    private Node head;
    private Node tail;

    private int size;

    public MiddleOfTheLinkedlList(){
        this.size = 0;
    }


    // display function
    public  void display(){
        SingleLikedListMain.Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("end");

    }

    private  class Node{
        private int value;
        private SingleLikedListMain.Node next;

        public  Node(int value){
            this.value = value;
        }

        public  Node(int value, SingleLikedListMain.Node next){
            this.value = value;
            this.next = next;
        }
    }
}
