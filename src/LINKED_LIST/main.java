package LINKED_LIST;

public class main {
    public static void main(String[] args) {
/*
        SingleLikedListMain list = new SingleLikedListMain();


        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.insertLast(0);

        list.insert(5,3);

        list.display();

        System.out.println();

//        list.deleteLast();
//        list.deleteFirst();
        list.delete(3);

        list.display();

        list.getNodeOfvalue(4);
*/

  /*
        DoublyLinkedListMain list = new DoublyLinkedListMain();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);


        list.insertLast(5);
        list.insertLast(6);

        list.insertAfterNode(4,30);
        list.display();


   */
        CircularLinkedListMain list = new CircularLinkedListMain();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.display();

        list.delete(4);
        list.display();

    }
}
