package SORTING;

import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

    }
    static void quickSort(List<Integer>arr, int low, int high){
        while(low < high){
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low , partionIndex -1);
            quickSort(arr, partionIndex+1, high);
        }


        // to find partition
        static int partition(List<Integer> arr, int low, int high){
            int pivot = arr.get(low);
            int i = low;
            int j = high;

            while(i < j){
                while(arr.get(i) <= pivot && i <= high-1) i++;
                while(arr.get(j) > pivot && j >= low) j++;

            if(i < j){
                int temp =
            }
            }
        }
    }
}
