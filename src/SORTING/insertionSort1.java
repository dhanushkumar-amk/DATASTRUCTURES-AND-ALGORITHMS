package SORTING;

import java.util.Arrays;

public class insertionSort1 {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2,6};
        InsertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n; i++) {
            int key = arr[i]; // to store the element in the key

            int j = i - 1; // unsorted array is started in end of the sorted array so i is end of the sorted array so we start the j = i-1;

            while( j>=0 && arr[j] > key){
                arr[j+1] = arr[j]; // right shift
                j--;
            }
            arr[j+1] = key; // to insert the key element  to the correct position
        }
    }
}
