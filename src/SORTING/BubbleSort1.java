package SORTING;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
    int[] arr = {3,6,1,4,2,5};
    BubbleSort(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1 ; i++) {
            // j < n - i - 1  because the each iteration the last element is goes to currect index so every time weleave the one last element and check
            for (int j = 0; j < n - i - 1; j++) {
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
              }
        }
    }

}
