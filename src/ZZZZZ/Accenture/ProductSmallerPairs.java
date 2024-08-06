package ZZZZZ.Accenture;

import java.util.Arrays;

public class ProductSmallerPairs {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,9,7,1};
        int sum = 9;
        System.out.println(product(arr, sum));

    }
    static  int product(int[] arr, int sum){

        int n = arr.length;
        // base condition
        if(n==0 || n < 2)
            return -1;

        // sort an array
        Arrays.sort(arr);

        if((arr[0] + arr[1]) <= sum)
            return arr[0] * arr[1];

        return  0;

    }
}
