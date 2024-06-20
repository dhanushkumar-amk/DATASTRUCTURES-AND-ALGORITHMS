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


    // another method

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int actualSyum = n*(n+ 1)/2;
        int result = actualSyum - sum;
        return result;
    }
}
