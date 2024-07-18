package LINKED_LIST;





// blue print of the node
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL1 {

    // print the element
    static void printLinkedList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    
    public static void main(String[] args) {
        // creating the node
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        // connect each other or link each other
      //  System.out.println(p1.data);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        Node head = p1;

        printLinkedList(head);
    }
}
