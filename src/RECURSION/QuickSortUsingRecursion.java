package RECURSION;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {

    }
    static  void sort(int[] arr, int low, int high){
        // base case
        if(low >= high)
            return;

        int start = low;
        int end = high;

        // assuming the pivot point as middle element
        int mid = start + (end -start)/2;
        int pivot =arr[mid];

        while (start <= end){

            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        sort(arr, low, end);
        sort(arr,start, hoi);
    }
}
