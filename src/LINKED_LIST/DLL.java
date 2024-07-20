package LINKED_LIST;

public class DLL {

  private Node head;
     public void insertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.previous = null;

         if(head != null)
             head.previous = node;

         head = node;
     }

     public  void display(){
         Node node = head;
         while(node != null) {
             System.out.print(node.val +" -> ");
            node = node.next;
         }
         System.out.println("End");
     }






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
