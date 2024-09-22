package LINKED_LIST;

public class MiddleOfTheLinkedlList {
    private Node head;
    private Node tail;

    private int size;

    public MiddleOfTheLinkedlList(){
        this.size = 0;
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



    //main function
    public void middle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow);
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


    public static void main(String[] args) {
        MiddleOfTheLinkedlList list = new MiddleOfTheLinkedlList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);



        list.display();





    }
}
