package LINKED_LIST;

public class DLL {

  private Node head;

// insert first function in dll
     public void insertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.previous = null;

         if(head != null)
             head.previous = node;

         head = node;
     }


    // insert last

    public void  insertLast(int val){
         Node node = new Node(val);
         Node last = head;
         node.next = null;

         if(head == null){
             node.previous = null;
             head = node;
             return;
         }
         while(last.next != null){
             last = last.next;
         }
         last.next = node;
         node.previous = last;
    }




    // display function
     public  void display(){
         Node node = head;
         Node last = null;
         while(node != null) {
             System.out.print(node.val +" -> ");
            last = node;
             node = node.next;
         }
         System.out.println("End");

         System.out.println("Print in reverse");
         while(last != null){
             System.out.print(last.val + " -> ");
             last = last.previous;
         }
         System.out.println("Start");
     }



// display reverse
//    public  void displayRev(){
//        Node node = head;
//        while(node != null) {
//            System.out.print(node.val +" -> ");
//            node = node.next;
//        }
//        System.out.println("End");
//    }





    private class Node{
        int val;
        Node next;
        Node previous;

    public Node(int val){
        this.val = val;
      }
      public Node(int val, Node next, Node previous){
        this.val = val;
        this.next = next;
        this.previous = previous;
      }
    }
}
