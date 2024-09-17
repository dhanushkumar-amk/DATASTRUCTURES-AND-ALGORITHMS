package LINKED_LIST;

public class DoublyLinkedListMain {


    Node head;

    public  void  insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;
    }



    // display function
    public  void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + " -> " );
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("print in reverse : ");
        while (last != null){
            System.out.println(last.val +" <- "  );
            last = last.prev;
        }

    }


    // every node has below items
    private  class  Node {
        int val;
         Node next;
          Node prev;

        public  Node(int val){
            this.val = val;
        }


        public  Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
