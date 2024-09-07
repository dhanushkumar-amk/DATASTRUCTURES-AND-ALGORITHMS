package RECURSION;

public class SubSetSumUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {10,20,15,5};
        int sum = 25;
        countSubSet(arr,sum, 0);

    }
    static  int countSubSet(int[] arr, int sum, int index){
        // base case

        if(sum == 0)
            return 1;

        if (sum < 0)
            return 0;

        if (index == arr.length)
            return 0;


        return countSubSet(arr, sum - arr[index], index + 1) + countSubSet(arr, sum, index + 1);
    }
}
