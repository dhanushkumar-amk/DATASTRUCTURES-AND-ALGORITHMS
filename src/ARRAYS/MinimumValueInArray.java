package ARRAYS;

public class MinimumValueInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,81,9,10};
        System.out.println(MinimumElement(arr));
    }
    static int MinimumElement(int[] arr){
        int min = Integer.MAX_VALUE;
//        int min = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return  min;
    }
}
