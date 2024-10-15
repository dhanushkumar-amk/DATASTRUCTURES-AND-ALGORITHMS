package ARRAYS;

public class BirthDayCakeCandle {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,1,3};
        System.out.println(count(arr));
    }

    public  static  int count(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == max)
                count++;
        }

        return count;
    }


}
