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

        // custom insert method used to insert the element in the last
        list.insertLast(6);


        // insert the element in the particular index of an linked list
        list.insert(7,3);
        // to print the element in linked list
        list.display();


    }

}
