package LINKED_LIST;


public class RemoveDuplicatesFomSortedList {
    private Node head;
    private Node tail;

    private int size;

    public RemoveDuplicatesFomSortedList(){
        this.size = 0;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFomSortedList list = new RemoveDuplicatesFomSortedList();
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);

        list.display();

        System.out.println();
        list.removeDuplicates();

        list.display();

    }



// main function
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



    // insert function from sll
    public void insertFirst(int val){
        Node node = new Node(val);   // create a nwe node;
        node.next = head;  //  node => next = head
        head = node; // then this node will be first head

        if (tail == null)
            tail = head; // if tail is a empty then head is equal to tail

        size += 1;    // else size+=1

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
