package LINKED_LIST;

import java.util.LinkedList;

public class SinglyLinkedList {

    public static void main(String[] args) {

            // linked list offer by java collection
        // LinkedList<Integer> list = new LinkedList<>();

        // to add the element in the linked list
         // list.add(34);
         CustomLinkedList list = new CustomLinkedList();

        // custom insert method using custom liked list

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
       // 5 -> 4 -> 3 -> 7 -> 2 -> 1 -> End

        // custom insert method used to insert the element in the last
        list.insertLast(6);
       //        5 -> 4 -> 3 -> 2 -> 1 -> 6 -> End

        // insert the element in the particular index of an linked list
        list.insert(7,3);
       //        5 -> 4 -> 3 -> 7 -> 2 -> 1 -> 6 -> End
        // to print the element in linked list



        // delete the firs element
        System.out.println(list.deleteFirst());

        //  5 -> 4 -> 3 -> 7 -> 2 -> 1 -> 6 -> End
       // 5 is removed
       // 4 -> 3 -> 7 -> 2 -> 1 -> 6 -> End

        // delete the particular value
        System.out.println(list.deleteIndex(3));
        //4 -> 3 -> 7 -> 1 -> 6 -> End
        // 2 has been deleted

        // to delete the last element
        System.out.println(list.deleteLast());
       // 4 -> 3 -> 7 -> 2 -> 1 -> End
        list.display();


        System.out.println(list);
    }
}
