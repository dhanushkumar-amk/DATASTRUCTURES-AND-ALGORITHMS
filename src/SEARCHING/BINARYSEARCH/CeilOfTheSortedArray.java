package SEARCHING.BINARYSEARCH;

public class CeilOfTheSortedArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int target = 25;
        System.out.println(ceil(nums,target));
    }
    //lower bound is the smallest value that is greater or equal to the target
    static int ceil(int[]nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int answer = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                answer = mid;
                high = mid -1;
            }
            else low = mid + 1;
        }
        return answer;
    }
    }
}
