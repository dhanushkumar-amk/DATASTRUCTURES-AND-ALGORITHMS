package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class SAMPLE {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // to add the element in the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // to get the first element in an queue
        System.out.println(queue.peek());

        // to remove the first element in queue
        queue.remove();

        System.out.println(queue);

        
    }
}
