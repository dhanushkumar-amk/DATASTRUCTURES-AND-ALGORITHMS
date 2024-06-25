package SEARCHING.BINARYSEARCH;

public class LowerBound {
    public static void main(String[] args) {
   int[] nums = {2,33,44,56,65,67,87,98};
   int target = 68;
   int n = 8;
        System.out.println(lowerBound(nums,target,n));
    }
    //lower bound is the smallest value that is greater or equal to the target
    static int lowerBound(int[]nums, int target, int n){
        int low = 0;
        int high = n-1;
        int answer = n;

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
