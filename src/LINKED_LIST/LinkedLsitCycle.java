package LINKED_LIST;

public class LinkedLsitCycle {


LinkedLsitCycle next;
    // leetcode 141 -problem can't have default solution
    public boolean hasCycle(LinkedLsitCycle head) {
        LinkedLsitCycle fast = head;
        LinkedLsitCycle slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }
        return false;
    }

}
