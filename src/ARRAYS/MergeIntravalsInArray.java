package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntravalsInArray {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6}, {8,10}, {15,18}};
        int[][] merged = mergeIntervals(nums);
        System.out.println(Arrays.deepToString(merged));

    }
    public static int[][] mergeIntervals(int[][] nums) {
        if (nums.length <= 1) return nums;

        Arrays.sort(nums, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = nums[0];
        result.add(newInterval);

        for (int[] interval : nums) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}
