package ARRAYS;

public class LeftRotationByDPlaces {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6,7,8,9};
     int d = 1;
     leftRotate(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static  void leftRotate(int [] arr, int d){
        // base condition
        int n = arr.length;
        if(n == 0) return;

        d = d % n;

        // swap  from 0 to d-1
        swap(arr, 0,d-1);
 // swap  from d to n-1
        swap(arr, d, n-1);
//        swap from 0 to n-1
        swap(arr, 0, n-1);


    }
    public static void swap(int arr[], int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
