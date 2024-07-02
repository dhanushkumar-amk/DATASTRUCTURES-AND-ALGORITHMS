package SORTING.CYCLICSORT;

import java.util.Arrays;

public class SAMPLE {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
    cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cyclicSort(int[] arr){
        // check - swap - move
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                int temp =arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }
}
