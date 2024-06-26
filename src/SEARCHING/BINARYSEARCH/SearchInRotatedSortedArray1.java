package SEARCHING.BINARYSEARCH;

import  java.util.*;
public class SearchInRotatedSortedArray1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = 9, target = 1;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
    public static int search(ArrayList<Integer> arr, int n, int target){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr.get(mid) == target) return  mid;

            if(arr.get(low) < arr.get(mid)){
                if(arr.get(low) <= target && target <=arr.get(mid)){
                    high = mid -1;
                }else{
                    low =mid + 1;
                }
            }
            else{
                if(arr.get(mid) <= target && target <= arr.get(high)){
                    low = mid + 1;
                }else {
                    high= mid -1;
                }
                {

                }
        }
    }
}
