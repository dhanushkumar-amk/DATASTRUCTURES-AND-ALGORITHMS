package RECURSION;

public class FindSumOfAllElementsInaArray {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4};
        System.out.println(sum(arr, 0));
    }

    static  int sum(int[] arr, int index){
        // base case
        if ( index == arr.length)
            return 0;


        return sum(arr, index + 1) + arr[index];
    }

}
