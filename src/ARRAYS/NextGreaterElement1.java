package ARRAYS;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
    int [] nums1 = {4,1,2};
    int [] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
    public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> helperStack = new Stack<>();

        int[] nextGreaterElement = new int[nums2.length];

        for (int i = nums2.length - 1; i >=0 ; i--) {
            int element = nums2[i];

            if (helperStack.isEmpty()){
                helperStack.push(element);
                nextGreaterElement[i] =-1;
                continue;
            }

            if (helperStack.peek() > element){
                nextGreaterElement[i] = helperStack.peek();
                continue;
            }

            // remove all  elements in stack smaller than element

            while (helperStack.peek() <= element && !helperStack.isEmpty()){
                helperStack.pop();
            }

            if (helperStack.isEmpty())
                nextGreaterElement[i] =-1;
            else
                nextGreaterElement[i] = helperStack.peek();

            helperStack.push(element);

        }
        return nextGreaterElement;

    }
}
