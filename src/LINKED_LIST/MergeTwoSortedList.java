package LINKED_LIST;

public class MergeTwoSortedList {

        private Node head;
        private Node tail;

        private int size;

    public MergeTwoSortedList(){
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


    // display function
    public  void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("end");

    }

//     merge teo Sorted array
    public  static  MergeTwoSortedList merge(MergeTwoSortedList first, MergeTwoSortedList second){
        Node f = first.head;
        Node s = second.head;

        MergeTwoSortedList ans = new MergeTwoSortedList();

        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        // extra element present whenever the one of the list is complete
        while( f != null){
        ans.insertLast(f.value);
        f = f.next;
        }

        while( s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return  ans;

    }

    public static void main(String[] args) {
      MergeTwoSortedList first = new MergeTwoSortedList();
      MergeTwoSortedList second = new MergeTwoSortedList();

      first.insertLast(1);
      first.insertLast(3);
      first.insertLast(5);


      second.insertLast(1);
      second.insertLast(2);
      second.insertLast(9);
      second.insertLast(14);



      MergeTwoSortedList ans =  MergeTwoSortedList.merge(first, second);
      ans.display();


    }



    // base for all

    public  class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }   }