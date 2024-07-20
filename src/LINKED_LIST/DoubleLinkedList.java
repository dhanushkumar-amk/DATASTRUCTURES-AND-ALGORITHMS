package LINKED_LIST;

public class DoubleLinkedList {
    public static void main(String[] args) {

        DLL list = new DLL();
        // insert the value in dll
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        // display the value
        list.display();
    }
}
