package QUEUE;

import java.util.PriorityQueue;

public class MaximumProductAfterKOperations {
    public static void main(String[] args) {
        int[] arr = {6,3,4,2,5};
        int k = 4;
        System.out.println("The maximum Product of the array after k operations is : " + maximum(arr, k));
    }
    public static int maximum(int[] arr, int k){


        // creating the priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int mod = 1000000007;

        // adding the each element to the priority queue from arr
        for(int element : arr)
            priorityQueue.offer(element);

        for (int i = 0; i <k ; i++) {

            int minimumElement = priorityQueue.remove();
            minimumElement++;

            priorityQueue.offer(minimumElement);
        }

        long result = 1;
        while (!priorityQueue.isEmpty())
        {
        result *= priorityQueue.poll();
        result %= mod;
        }
    return  (int)  result;
    }
}
