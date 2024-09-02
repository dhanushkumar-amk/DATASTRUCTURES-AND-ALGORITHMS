package ARRAYS;

import java.util.ArrayList;

public class IceCreamParlourProblemInHackerRank {
    public static void main(String[] args) {
        int m = 6;
        int[] arr = {1,3,4,5,6};
//        ArrayList<Integer> ans = iceCream(m, arr);
        System.out.println(iceCream(m,arr));
    }
   static ArrayList<Integer> iceCream(int m, int[] arr){

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <arr.length-1 ; i++) {
           for (int j = i + 1; j <arr.length; j++) {
               if (arr[i] + arr[j] == m) {
                   res.add(i + 1);
                   res.add(j + 1);
               }
               break;
           }
       }
        return res;
   }
}
