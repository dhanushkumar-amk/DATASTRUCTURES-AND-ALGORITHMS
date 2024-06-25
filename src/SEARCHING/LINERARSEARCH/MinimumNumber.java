package SEARCHING.LINERARSEARCH;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {22,33,55,77,111};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
