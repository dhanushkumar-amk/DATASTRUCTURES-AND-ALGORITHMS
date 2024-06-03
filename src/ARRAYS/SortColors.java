package ARRAYS;

import java.util.Arrays;

// leetcode 75
public class SortColors {
    public static void main(String[] args) {
int[] nums = {2,0,2,1,1,0};
SortColor(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int[] SortColor(int[] nums){

        // declare 3 pointers
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid <= end){
            switch (nums[mid]){
                case 0:
              swap(nums, start, mid);
               mid++;
               start++;
               break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;

            }
        }

        return nums;
    }

    // function for swapping
public static void swap(int[] nums, int position1, int position2){
        int temp = nums[position1];
        nums[position1] =  nums[position2];
        nums[position2] = temp;
    }

}
