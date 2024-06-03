package ARRAYS;

public class maximumValueInarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,81,9,10};
        System.out.println(MaximumElement(arr));
    }
    static int MaximumElement(int[] arr){
        int max = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return  max;
    }
}
