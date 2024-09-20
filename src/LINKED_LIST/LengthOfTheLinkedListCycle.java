package LINKED_LIST;

public class LengthOfTheLinkedListCycle {

    // amazon and flipkart

    LengthOfTheLinkedListCycle next;

    public int LengthCycle(LengthOfTheLinkedListCycle head) {
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
