package ARRAYS;

public class JumpGame {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 5, 2, 1, 0, 0, 1, 3 };
        System.out.println(JumpGame1(nums));
    }
    static boolean JumpGame1(int[] nums){
        int finalPosition = nums.length-1;
        for (int index = nums.length-2; index >=0 ; index--) {
            if(nums[index] + index >= finalPosition)
            finalPosition = index;
        }

        return finalPosition ==0;
    }
}
