package ARRAYS;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
   // Arrays in java
        int arr[] = new int[2];

        // creating of the array
    int num[] = {1,2,3,4,5};
    // changing the value in array
    num[1] = 45;

        System.out.println(num[0]);
        System.out.println(num[1]);

        // length of an array
        System.out.println(num.length);

//        loop through array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();

        //  for each loop in array
        for (int i : num){
            System.out.print(i);
        }

    }


}
