package STRINGS;

import java.util.Arrays;

public class GameOfThroneInHackerRank {
    public static void main(String[] args) {
    String s = "madam";
        System.out.println(got(s));
    }
    static String got(String s){
        // to convert an string into char array
        char[] arr = s.toCharArray();

        // Arrays.sort is an static method we ca call by className
        Arrays.sort(arr);

        int i= 0;
        int nonPairCount = 0;
        while(i <arr.length){
            if ( i <arr.length-1 && arr[i] == arr[i+1])
                i = i + 2;
            else {
                i++;
                nonPairCount++;
            }
        }

        if (nonPairCount <= 1)
            return  "Yes";
        else
            return "No";

    }
}
