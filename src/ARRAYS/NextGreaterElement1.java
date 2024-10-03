package ARRAYS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> helperStack = new Stack<>();
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        int[] result = new int[nums1.length];

        // Traverse nums2 to fill the nextGreaterMap with next greater elements
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            // Pop elements from stack while they are smaller than the current element
            while (!helperStack.isEmpty() && helperStack.peek() <= element) {
                helperStack.pop();
            }

            // If the stack is empty, there is no greater element
            if (helperStack.isEmpty()) {
                nextGreaterMap.put(element, -1);
            } else {
                nextGreaterMap.put(element, helperStack.peek());
            }

            // Push the current element onto the stack
            helperStack.push(element);
        }

        // Use the map to find next greater elements for nums1
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}
