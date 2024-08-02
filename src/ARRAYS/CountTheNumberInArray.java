package ARRAYS;

public class CountTheNumberInArray {

    public static void main(String[] args) {

        int number = 5;
        int[]  arr = {1,1,2,3,4,5,6,5,5,5,5,5};
        System.out.println(count(arr, number));
    }
    static int count(int[] arr, int number){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == number) count++;
        }
        return  count;
    }
}
