package LINKED_LIST;



public class LinkedListDemo {

    private Node head;
    private Node tail;

    private  int size;

    public LinkedListDemo(){
        this.size = 0;
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
