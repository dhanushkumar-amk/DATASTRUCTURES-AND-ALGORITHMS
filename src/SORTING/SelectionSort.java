package SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) { // because j is always start with i+1;
            int Currentvalue = i; // store the index value not element
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < arr[Currentvalue]){ // to check the smallest element
                    Currentvalue = j;
                }

                // swap
                int temp = arr[i];
                arr[i] = arr[Currentvalue];
                arr[Currentvalue] = temp;
            }

        }
    }

}
