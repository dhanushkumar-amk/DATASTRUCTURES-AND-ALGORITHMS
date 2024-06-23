package ARRAYS;

import java.util.*;
import  java.util.Arrays;
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
    ArrayList<Integer> ans = removeAllDuplicates( nums);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static ArrayList<Integer> removeAllDuplicates(int[] nums){

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <nums.length ; i++) {
            int index = Math.abs(nums[i]) -1;

            if(nums[index] < 0)
                result.add(index+1);

            // change index to negative
            nums[index] = nums[index] * -1;
        }

        return  result;
    }
}
