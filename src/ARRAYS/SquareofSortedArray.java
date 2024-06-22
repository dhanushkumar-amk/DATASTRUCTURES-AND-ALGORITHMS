package ARRAYS;

public class SquareofSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9};
        int[] result = sortedSquare(arr);
        for (int i = 0; i < result.length ; i++) {
            System.out.print( result[i]);
        }
    }
    public static int[]  sortedSquare(int arr[]){
        int[] result= new int[arr.length];

        // square the each value in the array
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] * arr[i];
        }

        int head = 0;
        int tail = arr.length-1;

        for (int position = arr.length-1;position >= 0 ; position--) {
            if(arr[head] > arr[tail] ){
                result[position] = arr[head];
            head++;
            }else {
                result[position] = arr[tail];
                tail--;
            }
        }
        return  result;

    }
}
