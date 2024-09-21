package LINKED_LIST;


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

        if (length == 0){
            return null;
        }
        // find the start
        LinkedListCycle2 first = head;
        LinkedListCycle2 second = head;

        while (length > 0){
            second = second.next;
            length--;
        }

        // keep moving both forward
        while (first!= second){
            first = first.next;
            second = second.next;
        }

        return  second;
    }





    public int LengthCycle(LinkedListCycle2 head) {
        LinkedListCycle2 fast = head;
        LinkedListCycle2 slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculate the length

                LinkedListCycle2 temp = slow;
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






