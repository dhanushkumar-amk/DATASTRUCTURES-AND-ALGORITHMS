package ZZZZZ.Accenture;

import java.util.Arrays;

public class FriendlyArray {
    public static void main(String[] args) {
        int[] arr = {4,1,5};
        System.out.println(friendlyElement(arr));
    }
    static  int friendlyElement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int sum = (arr[1] - arr[0]) + (arr[n-1] - arr[n-2]);

        int abs1;
        int abs2;

        for (int i = 1; i <n-1 ; i++) {
            abs1 = arr[i]- arr[i-1];
            abs2 = arr[i+1] - arr[i];

            sum += Math.min(abs1, abs2);
        }
        return  sum;
    }
}
