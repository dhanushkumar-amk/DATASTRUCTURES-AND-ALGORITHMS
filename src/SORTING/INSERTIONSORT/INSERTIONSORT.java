package SORTING.INSERTIONSORT;

public class INSERTIONSORT {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,7,4,11,13};
        System.out.println("Before sorting :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] ans =sort(arr);

        System.out.println("After Sorting : ");
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i] + " ");

        }
    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int key= arr[i];
            int j = i - 1;

            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
