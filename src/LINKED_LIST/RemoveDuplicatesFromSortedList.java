package LINKED_LIST;

public class RemoveDuplicatesFromSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If list is empty or has only one node, no duplicates to remove
        }

        ListNode current = head; // Pointer to track the current node

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Skip the duplicate node
            } else {
                current = current.next; // Move to the next distinct node
            }
        }

        return head; // Return the head of the modified list
    }

    // Method to display the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        RemoveDuplicatesFromSortedList.ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(1);
        head.next.next = solution.new ListNode(2);
        head.next.next.next = solution.new ListNode(3);
        head.next.next.next.next = solution.new ListNode(3);

        System.out.println("Original list:");
        solution.printList(head); // Output: 1 1 2 3 3

        head = solution.deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        solution.printList(head); // Output: 1 2 3
    }
}
