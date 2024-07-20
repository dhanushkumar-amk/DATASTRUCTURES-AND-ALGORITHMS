package LINKED_LIST;

import java.util.LinkedList;

public class SinglyLinkedList {

    public static void main(String[] args) {

            // linked list offer by java collection
        // LinkedList<Integer> list = new LinkedList<>();

        // to add the element in the linked list
         // list.add(34);
         CustomLinkedList list = new CustomLinkedList();


        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();
    }

}
