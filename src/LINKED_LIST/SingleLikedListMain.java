package LINKED_LIST;


// All detail Explanation in note

public class SingleLikedListMain {

    private  Node head;
    private Node tail;

    private int size;

    public SingleLikedListMain(){
        this.size = 0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);   // create a nwe node;
        node.next = head;  //  node => next = head
        head = node; // then this node will be first head

        if (tail == null)
            tail = head; // if tail is a empty then head is equal to tail

        size += 1;    // else size+=1

    }


    // insert the value in last index
    public  void insertLast(int val){

        if (tail == null){
            insertFirst(val);
            return;
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }

    // insert the element in particular index

    public void  insert(int val, int index ){
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp  =  temp.next;
        }

        // insert the new node on current.next current equals to temp

        Node node = new Node(val, temp.next);

        // connect the previous node to nw node the previous node is an temp so temp.next == current node
        temp.next = node;
        size++;

    }


    // delete the first element
        public void deleteFirst(){

        head = head.next;

        if (head == null)
            tail = null;

        size--;

        }

//        delete a last element
    public void deleteLast(){
        if ( size <= 1) {
            deleteFirst();
            return;
        }

        Node secondLast = get(size - 2);

        tail = secondLast;
        tail.next = null;

    }

    // delete the particular index

    public  void delete(int index){
        if (index == 0)
            deleteFirst();

        if (index == size-1)
            deleteLast();

        Node previous = get(index - 1);

        previous.next = previous.next.next;
    }


    // get the node of the particular value
    public Node getNodeOfvalue(int value){

        Node node = head;

        while (node != null){
            if (node.value == value)
                return node;

            node = node.next;
        }
        // can't find return null
        return  null;
    }


    // get the size function to a reference

    public Node get(int index){

        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }

        return  node;
    }


    // display function
    public  void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
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
