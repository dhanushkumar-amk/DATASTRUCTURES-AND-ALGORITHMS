package SEARCHING.BINARYSEARCH;

public class SplitArrayLargestSum {
    public static int countPartitions(int[] a, int maxSum) {
        int n = a.length; //size of array.
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                //insert element to current subarray
                subarraySum += a[i];
            } else {
                //insert element to next subarray
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }

    public static int largestSubarraySumMinimized(int[] a, int k) {
        int low = a[0];
        int high = 0;
        //find maximum and summation:
        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }

        //Apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}
