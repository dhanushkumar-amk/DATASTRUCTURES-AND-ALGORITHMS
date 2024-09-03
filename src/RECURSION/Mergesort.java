package RECURSION;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr  = {3,2,6,5,8,7};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  int[] merge(int[] arr){

        // base case
        if(arr.length == 1)
            return  arr;

        int mid = arr.length/2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return  mergeMix(left, right);

    }

    private static int[] mergeMix(int[] left, int[] right) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] sorted = new int[left.length + right.length];

        while (i < left.length && j < right.length){

            if (left[i] < right[j]){
                sorted[k] = left[i];
                i++;
                k++;
            }
            else {
                sorted[k] = right[j];
                j++;
                k++;
            }
        }

        // remaining elements

        while (i < left.length){
            sorted[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            sorted[k] = right[i];
            j++;
            k++;
        }

        return  sorted;

    }
}
