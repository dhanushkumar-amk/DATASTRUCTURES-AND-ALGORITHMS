package LINKED_LIST;

public class main {
    public static void main(String[] args) {
        ll list = new ll();


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

        System.out.println(ll.list.getNodeOfvalue(5));

    }
}
