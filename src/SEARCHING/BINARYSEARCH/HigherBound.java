package SEARCHING.BINARYSEARCH;

public class HigherBound {
    public static void main(String[] args) {
        int[] nums = {2,33,44,56,65,67,87,98};
        int target = 68;
        int n = 8;
        System.out.println(higherBound(nums,target,n));
    }
// upper bound is the smallest index such that arr[mid]> answer
    // the smallest number that greater than the target
    static int higherBound(int[] nums,int target, int n){
        int low = 0;
        int high = n-1;
        int answer = n;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target) {
                answer = mid;
                high = mid -1;
            }
            else low = mid -1;
        }
        return answer;
    }
}
