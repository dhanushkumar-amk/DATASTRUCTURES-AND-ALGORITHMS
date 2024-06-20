package ARRAYS;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,0,0,5,4};

        zeroToEnd(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] zeroToEnd(int arr[]){
        int j = -1;

        for ( int i = 0; i < arr.length ; i++) {
            if(arr[i] == 0){
                j = i;
                break;;
            }
        }

        for (int i = j+1; i <arr.length ; i++) {
            if(arr[i] != 0){
          int start = 0;
          int end = arr.length-1;

          while (start < end){
              int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;
              start++;
              end--;
          }
          j++;
            }
        }
    return arr;
    }


}
