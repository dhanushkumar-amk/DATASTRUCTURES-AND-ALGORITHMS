package LINKED_LIST;

public class CustomLinkedList {

    private  Node head;
    private  Node tail;
    private int size;

    public  CustomLinkedList() {
        this.size = 0;
    }
    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node  = new Node(val);
        tail.next = node;
         tail = node ;
         size++;
    }

    public void insertFirst(int val){
        Node node  = new Node(val);

        // if we add the value in the front of the linked list then assign the value of head to the inserted element
        node.next = head;
        head = node;

        // tail has value of null then its the point of head
        if(tail == null){
            tail = head;
        }
        // then increase the size
        size +=1;
    }

    // insert the value at the particular index
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(0);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp =  head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node  = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // delete the first element
    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return  val;
    }
    // delete the last element
    public int deleteLast(){
        if(size <= 1){
            return  deleteFirst();
        }
         Node secondLast = get( size - 2);
       int val = tail.value;
       tail = secondLast;
       tail.next = null;
       return  val;
    }


    // delete the particular value in an linkedlist
    public int deleteIndex(int index){
        if(index == 0)
            return deleteFirst();

        if(index == size-1)
            return  deleteLast();

        Node previous = get(index -1);
        int val = previous.next.value;

        previous.next = previous.next.next;

        return  val;


    }

    // find the index
    public  Node find(int value){
        Node node = head;
        while( node !=  null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return  node;
    }

    // get the index
    public Node get(int index){
    Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }

    // display
    public void display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
