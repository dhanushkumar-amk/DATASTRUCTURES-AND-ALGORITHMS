package SORTING;

import java.util.List;

public class MergeSort {
    public static void main(String[] args) {

    }
    static void quickSort(List<Integer>arr, int low, int high){
        while(low < high){
            int partitionIndex = partion(arr, low, high);
            quickSort(arr, low , partionIndex -1);
            quickSort(arr, partionIndex+1, high);
        }


        // to find partition
        static 
    }
}
