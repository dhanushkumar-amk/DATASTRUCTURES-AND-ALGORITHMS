package ARRAYS;

public class NumberAppearsOnces {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4,5,5};
        System.out.println(AppearsOnces(arr));
    }
    public static int AppearsOnces(int arr[]){
        int xor =0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return  xor;
    }
}
