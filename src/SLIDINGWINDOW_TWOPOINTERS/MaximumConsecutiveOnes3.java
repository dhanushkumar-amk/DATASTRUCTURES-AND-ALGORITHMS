package SLIDINGWINDOW_TWOPOINTERS;

public class MaximumConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println("The maximum Consecutive element is : " + maximumConsecutive(nums, k));

    }
    static int maximumConsecutive(int[] nums, int k){

        // init points

        int left = 0;
        int right = 0;
        int zeros = 0;
        int length;
        int maxLength = 0;

        while(right < nums.length){
            if(nums[right] == 0)
                zeros++;

            if(zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                    left++;
                }
            }
                if(zeros <= k){
                    length = right - left + 1;
                    maxLength = Math.max(maxLength, length);
                }
                right++;
            }
        return  maxLength;
    }
}
