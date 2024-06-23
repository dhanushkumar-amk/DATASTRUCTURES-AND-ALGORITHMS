package ARRAYS;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
int[] answer = sortOddAndEven(arr);
        for (int i = 0; i <answer.length ; i++) {
            System.out.print(answer[i] + " ");
        }
    }
    public static int[] sortOddAndEven(int[] arr){
        int left = 0;
        int right =  arr.length-1;

        while(true){
            while (left < arr.length && arr[left] % 2==0) left++;
            while(right > 0 && arr[right] %2 ==1) right--;

            if(left > right) break;

            // swap function
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }
}
