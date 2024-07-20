package LINKED_LIST;

//leetcode 83:

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
            // Example usage
            RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

            // Creating the sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
            ListNode head = new ListNode(1);
            head.next = new ListNode(1);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(3);

            System.out.println("Original list:");
            solution.printList(head); // Output: 1 1 2 3 3

            head = solution.deleteDuplicates(head);

            System.out.println("List after removing duplicates:");
            solution.printList(head); // Output: 1 2 3
        }
    }
