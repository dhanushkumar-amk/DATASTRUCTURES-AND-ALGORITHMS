package ARRAYS;

public class AVeryBigSum {
    public static void main(String[] args) {
        long[] arr = {1000001,1000001,1000002,1000003, 1000005};
        System.out.println(sum(arr));
    }

    static long sum(long[] arr){
        long sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
