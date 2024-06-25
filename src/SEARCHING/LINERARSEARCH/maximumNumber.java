package SEARCHING.LINERARSEARCH;

public class maximumNumber {
    public static void main(String[] args) {
        int[] arr = {22,33,55,77,111};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
