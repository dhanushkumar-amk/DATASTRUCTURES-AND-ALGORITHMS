package ARRAYS;

import java.util.PriorityQueue;

public class MaximumProductAfterKIncrement {
    public static void main(String[] args) {
        int[] arr = {6,3,4,2,5};
        int k = 4;
        System.out.println("The maximum Product of the array after k operations is : " + maximumProduct(arr, k));
    }
    public  static  int maximumProduct(int[] arr, int k){

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int mod = 1000000007;

        for (int num : arr)
            priorityQueue.offer(num);

        for (int i = 0; i <k ; i++) {

            int minElement = priorityQueue.remove();
            minElement++;

            priorityQueue.offer(minElement);

        }

        long result = 1;
        while(!priorityQueue.isEmpty())
        {
            result *= priorityQueue.poll();
             result %= mod;
        }
        return (int) result;


    }
}
