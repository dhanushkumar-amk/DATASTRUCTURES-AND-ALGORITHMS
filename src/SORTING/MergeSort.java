package SORTING;
import java.util.*;
import java.util.List;

public class MergeSort {
    static void quickSort(List<Integer>arr, int low, int high) {
        while (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partionIndex - 1);
            quickSort(arr, partionIndex + 1, high);
        }
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
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j,temp);
              }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            return j;
        }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = MergeSort.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    }
