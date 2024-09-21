package LINKED_LIST;


import java.lang.classfile.components.ClassPrinter;

public class LinkedListCycle2 {
    private LinkedListCycle2 next;

    public  LinkedListCycle2 detectCyclc(LinkedListCycle2 head){
        int length = 0;
        LinkedListCycle2 fast = head;
        LinkedListCycle2 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                length = LengthCycle(slow);
                break;
            }
        }
        // find the start
        LinkedListCycle2 first = head;
        LinkedListCycle2 second = head;

        while (length > 0){
            s = second.next;
            length--;
        }

        // keep moving both forward
        while (fast!= slow)

    }





    public int LengthCycle(LinkedListCycle2 head) {
        LengthOfTheLinkedListCycle fast = head;
        LengthOfTheLinkedListCycle slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculate the length

                LengthOfTheLinkedListCycle temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    length++;
                }while (temp != slow);


                return length;
            }
        }
        return 0;
    }
}






