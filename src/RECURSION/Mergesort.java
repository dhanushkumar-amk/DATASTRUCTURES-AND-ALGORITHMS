package RECURSION;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr  = {3,2,6,5,8,7};
        arr = merge(arr);
        System.out.println(arr);
    }
    static  int[] merge(int[] arr){

        // base case
        if(arr.length == 1)
            return  arr;

        int mid = arr.length/ 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return  mergeMix(left, right);
    }

    private static int[] mergeMix(int[] left, int[] right) {

        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }


        // it may possible if one of an array remains the element

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return  mix;
    }
}
