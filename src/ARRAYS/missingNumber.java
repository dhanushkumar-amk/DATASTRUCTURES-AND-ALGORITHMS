package ARRAYS;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 5, 2, 4, 8, 7, 10,6 };
        System.out.println(MissingNumber(arr));
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
}
