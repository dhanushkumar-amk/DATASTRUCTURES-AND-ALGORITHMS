package ARRAYS;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
//        System.out.println(MissingNumber(arr));

        System.out.println(missingNumber(arr));

    }
    static int MissingNumber(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum += arr[i];
        }
int actualSum =  n * (n+1)/2;
        int missingValue =   actualSum- sum;
        return missingValue;
    }


    // Training Problem

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
        }
        int actualSum = n*(n+ 1)/2;
        int result = actualSum - sum;
        return result;
    }
}
