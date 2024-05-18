package ARRAYS;

public class MinimumValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,81,9,10};
        System.out.println(MinimumElement(arr));
    }
    static int MinimumElement(int[] arr){
        int max = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < max){
                max = arr[i];
            }
        }
        return  max;
    }
}
