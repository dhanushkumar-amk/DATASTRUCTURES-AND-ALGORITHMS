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



/* another solution
class Solution {
    public int[][] merge(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            min = Math.min(min, intervals[i][0]);
            max = Math.max(max, intervals[i][0]);
        }

        int[] range = new int[max - min + 1];
        for (int i = 0; i < intervals.length; i++) {
            range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]);
        }

        int start = 0, end = 0;
        LinkedList<int[]> result = new LinkedList<>();
        for (int i = 0; i < range.length; i++) {
            if (range[i] == 0) {
                continue;
            }
            if (i <= end) {
                end = Math.max(range[i], end);
            } else {
                result.add(new int[] {start + min, end + min});
                start = i;
                end = range[i];
            }
        }
        result.add(new int[] {start + min, end + min});
        return result.toArray(new int[result.size()][]);
    }
}
 */