package SEARCHING.BINARYSEARCH;

import java.util.Arrays;

public class CountOccuranceOfTheElementsInArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;
        int n = 8;
        int[] ans = firstandlast(nums, target, n);
        System.out.println(Arrays.toString(ans));
    }
    // another way without using lower bound
    static int firstOccurance(int[] nums, int target, int n) {
        int low = 0;
        int high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }


    static int lastOccurance(int[] nums, int target, int n) {
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                high = mid - 1;
            }
            else  low = mid + 1;
        }
        return  last;
    }
    static int[] firstandlast(int[] nums, int target, int n){
        int first  = firstOccurance(nums, target,n);
        if(first == -1) return new int[] {-1,-1};
        int last = lastOccurance(nums,target,n);
        return new int[] {first,last};
    }

  public static  int[] count(int[] nums, int target, int n){
        int[] ans = firstandlast(nums,target,n);
    if(ans.firstOccurance == -1)
    }
}
