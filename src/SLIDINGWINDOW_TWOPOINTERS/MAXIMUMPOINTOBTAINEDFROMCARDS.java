package SLIDINGWINDOW_TWOPOINTERS;

public class MAXIMUMPOINTOBTAINEDFROMCARDS {
    public static void main(String[] args) {
        int[] nums ={6,2,3,4,7,2,1,8,7,1};
        int k = 4;
        System.out.println(maximumPoint(nums, k));
    }

    static int maximumPoint(int[] nums, int k){
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        int rightIndex = n-1;

        for (int i = 0; i <= k-1 ; i++) {
            leftSum += nums[i];
            maxSum = leftSum;
        }
        for (int i = k-1; i >= 0 ; i--) {
            leftSum -= nums[i];
            rightSum += nums[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum+rightSum);
        }
        return maxSum;
    }
}
