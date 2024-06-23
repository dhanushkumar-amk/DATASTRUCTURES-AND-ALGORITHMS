package ARRAYS;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int nums[] ={2,3,1,2,4,3};
        int target = 7;
        System.out.println(Minimum(nums,target));
    }
    public static int Minimum(int[] nums , int target){

        int minLengthWindow = Integer.MAX_VALUE;
        int currentSum = 0;

        int low = 0;
        int high = 0;

        while(high < nums.length){
            currentSum = nums[high];
            high++;


            while(currentSum >= target){
                int currentWindowSize = high - low;
                minLengthWindow = Math.max(currentWindowSize,minLengthWindow);

                currentSum -= nums[low];
                low++;
            }
        }

        return  minLengthWindow == Integer.MAX_VALUE ? 0 : minLengthWindow;
    }
}
