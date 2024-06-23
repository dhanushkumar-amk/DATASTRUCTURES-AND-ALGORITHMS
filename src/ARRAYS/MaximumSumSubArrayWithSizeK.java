package ARRAYS;

public class MaximumSumSubArrayWithSizeK {
    public static void main(String[] args) {
    int[] nums = {2,9,31,-4,21,7};
    int k = 3;
        System.out.println(maxSubarray(nums, k));
    }
    public static int maxSubarray(int nums[] , int k){

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for (int i = 0; i < k ; i++) {
            windowSum += nums[i];
        }

        for (int i = k; i <nums.length ; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum  = Math.max(maxSum, windowSum);
        }

        return  maxSum;
    }



}
