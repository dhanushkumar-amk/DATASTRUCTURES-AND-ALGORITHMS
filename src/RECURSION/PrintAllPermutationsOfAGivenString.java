package RECURSION;

import java.util.Scanner;

public class PrintAllPermutationsOfAGivenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        permutations(s.toCharArray(), 0);
    }
    static  void permutations(char[] arr,int fixedIndex){

        // base case
        if (fixedIndex == arr.length) {
            System.out.print(arr + " ");
            return;
        }

        for (int i = fixedIndex; i < arr.length ; i++) {
            swap(arr, i, fixedIndex);
            permutations(arr,fixedIndex+1);
            swap(arr, i, fixedIndex);
        }
    }

    static void swap(char[] arr, int i, int fixedIndex){
        char temp = arr[i];
        arr[i] = arr[fixedIndex];
        arr[fixedIndex] = temp;
    }
}
