package ARRAYS;

public class SumOfUniqueNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        System.out.println(UniqueElementsSum(arr));
    }
    public  static  int UniqueElementsSum(int arr[]){
        int[] frequency = new int[101];
        int sum = 0;

        for (int num : arr){
            frequency[num]++;
        }

        for (int i = 0; i < frequency.length ; i++) {
            if(frequency[i] == 1){
                sum += i;

            }
        }
        return sum;
    }
}
