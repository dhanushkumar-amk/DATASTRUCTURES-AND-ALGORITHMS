package ARRAYS;

import java.util.Arrays;

public class SwappingAnElementInArray {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8,9,10};
      swap(arr,1,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int startIndex, int endIndex){

            int  temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex]= temp;
    }
}
// output :
// [10, 2, 3, 4, 5, 6, 7, 8, 9, 1]