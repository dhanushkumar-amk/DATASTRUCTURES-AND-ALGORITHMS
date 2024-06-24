package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class DisapperingNumbersInArray {

    public static void main(String[] args) {
    int[] arr = {4,3,7,2,8,2,3,1};
List<Integer> ans = MissingNumber(arr);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public  static List<Integer>  MissingNumber(int[] arr){

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i])-1;

            if(idx < 0) continue;
            // if the idx is not ngative then we change it into neaative
            idx *= -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > 0) result.add(i + 1);
        }
        return  result;
    }

}
