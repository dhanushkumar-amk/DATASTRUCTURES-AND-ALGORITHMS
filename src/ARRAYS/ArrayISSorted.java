package ARRAYS;

public class ArrayISSorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5, 6, 8, 9};
        System.out.println(SortedOrNot(nums));
    }

    static boolean SortedOrNot(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
        return true;
            } else {
        continue;
            }

        }
        return false;
    }
}
