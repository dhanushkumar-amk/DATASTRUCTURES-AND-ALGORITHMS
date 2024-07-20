package STACK;

import java.util.Stack;

public class SAMPLE {
    public static void main(String[] args) {


        // creating the stack
        Stack<Integer> stack = new Stack<>();

        // add the elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // remove the element in stack
        stack.pop();

        System.out.println(stack);
    }
}
