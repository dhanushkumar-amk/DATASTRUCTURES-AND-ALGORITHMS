package SEARCHING.LINERARSEARCH;

import java.util.Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class CountEvenNumberOfDigitsInHasNumberInTheArray {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,3743};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)) count++;
        }
        return count;
    }

    // function to check the given number is even or not
    static  boolean even(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        if(count % 2 == 0) return true;
        else  return  false;
    }
}
