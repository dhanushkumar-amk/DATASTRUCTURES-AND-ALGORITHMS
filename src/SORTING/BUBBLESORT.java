package SORTING;

import java.util.Arrays;

public class BUBBLESORT {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr){
       boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
            swapped = false;
            // the current jth element is smaller than previous element then swap
            // for (int j = 1; j <arr.length ; j++)
                for (int j = 1; j <arr.length-i; j++) {
                // here the arr.length-i is for travel only on the unsorted array the j breaks automatically breaks the loop
                // both two condition is worked

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                swapped = true;
                }
            }
                // if the swap value is false then there is no swap is occured so it will break;
                if(!swapped) break;
        }
    }

    public static class SELECTIONSORT {
        public static void main(String[] args) {
            int[] arr = {4,5,3,2,1};
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }

        // it perform well in small list of elements

        static void insertionSort(int[] arr){
            for (int i = 0; i <arr.length ; i++) {
            // find the max element in the remaining array and swap it
            int lastIndex = arr.length-1 -i;
            int max = findMaxElement(arr, 0, lastIndex);
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
}
