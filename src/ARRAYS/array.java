package ARRAYS;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
     int nums[] = {1,2,3,4,5,6,7,8,9,10};

        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}
