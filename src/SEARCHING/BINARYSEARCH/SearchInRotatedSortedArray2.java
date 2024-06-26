package SEARCHING.BINARYSEARCH;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        boolean ans = searchInARotatedSortedArrayII(arr, target);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }

    public static boolean searchInARotatedSortedArrayII(int []arr, int target) {
        int n = arr.length;
        int low = 0;
        int high =n - 1;

        while (low < high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target) return true;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = mid + 1;
                high = mid - 1;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <=arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

// another way using linear search
class Solution {
    public boolean search(int[] nums, int target) {
        for(int num:nums){
            if(num==target){
                return true;
            }
        }
        return false;
    }
}
}
