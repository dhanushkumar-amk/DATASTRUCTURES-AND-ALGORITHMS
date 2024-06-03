package ARRAYS;

import java.util.Arrays;

public class ReverseAnarray {
    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7,8,9};
      Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// output :
//[9, 8, 7, 6, 5, 4, 3, 2, 1]