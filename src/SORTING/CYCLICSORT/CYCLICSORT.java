package SORTING.CYCLICSORT;
import java.util.Arrays;

public class SAMPLE {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
    cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // the cyclic sort is usd when the number of array gives 1 to range we se defentely  cyclic sort
    static  void cyclicSort(int[] arr){
        // check - swap - move is cyclic method
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] -1;
            // if the element is not in correct index then swap else i moves forward

            // check
            if(arr[i] != arr[correctIndex]){
                //swap
                int temp =arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            // move
            else i++;
        }
    }
}
