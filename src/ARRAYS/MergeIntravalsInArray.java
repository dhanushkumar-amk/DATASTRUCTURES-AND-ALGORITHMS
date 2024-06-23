package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntravalsInArray {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6}, {8,10}, {15,18}};


    }
    public static int[][] mergeIntervals(int[][] nums){

        if(nums.length <= 1) return  nums;

        Arrays.sort(nums, Comparator.comparingInt(i -> i[0]));

        List<Integer> result = new ArrayList<>();

        int[] newIntervals

        return result
    }

}
