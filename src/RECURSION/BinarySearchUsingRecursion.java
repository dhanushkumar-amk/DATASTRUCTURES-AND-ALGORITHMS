package RECURSION;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        System.out.println(binarySearch(arr, target, 0, 4));
    }
    static  int  binarySearch(int[] arr, int target, int start, int end){

        // base Condition
        if(start > end)
            return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] == target)
            return  mid;

        if(target > arr[mid])
            return binarySearch(arr, target, mid + 1, end);
        else
            return  binarySearch(arr, target, start, mid -1);
    }
}
