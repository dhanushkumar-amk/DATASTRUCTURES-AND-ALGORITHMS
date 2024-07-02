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
            // each step  max item will come to the last
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if the current element of j is smaller than previous element
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
