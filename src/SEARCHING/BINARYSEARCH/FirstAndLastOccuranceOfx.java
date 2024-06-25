package SEARCHING.BINARYSEARCH;

import java.util.Arrays;

public class FirstAndLastOccuranceOfx {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,8,8,11,13};
        int target = 8;
        int n = 8;
    int[] ans = firstandlast(nums,target,n);
        System.out.println(Arrays.toString(ans));
    }

    // lowerbound
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

    // upperbound
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
            else low = mid + 1;
        }
        return answer;
    }


    static  int[] firstandlast(int[] nums, int target, int n){
        int lower = lowerBound(nums,target,n);
        if(lower == n || nums[lower] != target) return new int[] {-1,-1};

        return new  int[]{lower, higherBound(nums,target, n)-1};

    }
}
