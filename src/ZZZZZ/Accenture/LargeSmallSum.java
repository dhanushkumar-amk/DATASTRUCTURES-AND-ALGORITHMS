package ZZZZZ.Accenture;

public class LargeSmallSum {
    public static void main(String[] args) {
    int[] arr = {3,2,1,7,5};
    int n = 6;
        System.out.println(largeSum(arr, n));
    }
    static  int largeSum(int[] arr, int n){
        int evenMax = Integer.MIN_VALUE;
        int secondEvenMax = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i += 2) {
            if(arr[i] > evenMax){
                secondEvenMax = evenMax;
                evenMax = arr[i];
            }
            else if(arr[i] > secondEvenMax)
                secondEvenMax = arr[i];
        }

        // find second odd max
        int oddMax = Integer.MIN_VALUE;
        int secondOddMax = Integer.MIN_VALUE;


        for (int i = 1; i <=n ; i += 2) {
            if(arr[i] > oddMax){
                secondOddMax = oddMax;
                oddMax = arr[i];
            }
            else if(arr[i] > secondOddMax)
                secondOddMax = arr[i];
        }

        int result = secondEvenMax + secondOddMax;

        return  result;
    }
}
