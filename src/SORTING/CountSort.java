package SORTING;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,2,1};
        countSort(arr);
        System.out.print( Arrays.toString(arr));
    }
    static void countSort(int[] arr){
        if(arr == null && arr.length <= 1) return;
        int max = arr[0];

        for (int  num : arr)
            if(num > max) max = num;

        int[] count = new int[max + 1];

        for(int num : arr) count[num]++;

        int index = 0;
        for (int i = 0; i <=max ; i++) {
            while(count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}
