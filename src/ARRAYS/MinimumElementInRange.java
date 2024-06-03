package ARRAYS;

public class MinimumElementInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,81,9,10};
        System.out.println(MinimumElement(arr, 2, 7));
    }
    static int MinimumElement(int[] arr ,int start, int end){
        int min = Integer.MAX_VALUE;
        for (int i = start; i <=end ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return  min;
    }
}
