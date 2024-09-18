package LINKED_LIST;

public class InsertUsingRecursion {
    private Node head;
    private Node tail;

    private int size;

    public InsertUsingRecursion(){
        this.size = 0;
    }

//     // insert the value using recursion
    public  void insertRecursion(int val, int index){
        
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
