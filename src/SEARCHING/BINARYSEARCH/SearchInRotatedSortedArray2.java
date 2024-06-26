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

        
        return false;
    }


}
