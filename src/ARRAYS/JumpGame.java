package ARRAYS;

public class JumpGame {
    public static void main(String[] args) {

    }
    static boolean JumpGame1(int[] nums){
        int finalPosition = nums.length-1;
        for (int index = nums.length-2; index >=0 ; index--) {
            if(nums[index] + index >= finalPosition)
            finalPosition = nums[index];
        }

        return finalPosition ==0;
    }
}
