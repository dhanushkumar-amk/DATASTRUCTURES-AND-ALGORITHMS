package ARRAYS;

public class max {
    public static void main(String[] args) {
        int[] arr = {244,3,45,7,8,90};
        System.out.println(maxNumber(arr));
    }
    static  int maxNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return  max;
    }
}
