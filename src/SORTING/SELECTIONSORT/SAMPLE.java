package SORTING.SELECTIONSORT;

import java.util.Arrays;

public class SAMPLE {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // it perform well in small list of elements

    static void insertionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
        // find the max element in the remaining array and swap it
        int lastIndex = arr.length -1 -i;
        // int max = findMaxElement(arr, 0, lastIndex);

        // max
            int max = 0;
            for (i = 0; i <= lastIndex ; i++) {
                if(arr[max] <  arr[i]) max  = arr[i];
            }

        //swap
         int temp = arr[max];
         arr[max] = arr[lastIndex];
         arr[lastIndex] = temp;
        }
    }


    static int findMaxElement(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] <  arr[i]) max  = i;
        }
    return  max;
    }
}
