package ARRAYS;

import java.util.*;

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
// multidimensional array
//int[][] mulArr = new int[][];
int arr1[] = {10,20};
        System.out.println(arr1[1]);


        // the fill method is used to fill the particular value

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        Arrays.fill(fruits, "Kiwi");

        for (int i = 0; i <fruits.length ; i++) {
            System.out.print(fruits[i]);
        }
        System.out.println();

        // sort
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
        Arrays.sort(cars);
        for (int i = 0; i <cars.length ; i++) {
            System.out.print(cars[i] + " ");

        }
    }




}
