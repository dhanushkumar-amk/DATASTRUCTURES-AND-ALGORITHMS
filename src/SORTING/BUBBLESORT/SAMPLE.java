package SORTING.BUBBLESORT;

public class SAMPLE {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {

            // the current jth element is smaller than previous element then swap
            // for (int j = 1; j <arr.length ; j++)
                for (int j = 1; j <arr.length-i; j++) {
                // here the arr.length-i is for travel only on the unsorted array the j breaks automatically breaks the loop
                // both two condition is worked

                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
