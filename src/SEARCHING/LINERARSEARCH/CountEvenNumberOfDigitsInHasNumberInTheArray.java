package SEARCHING.LINERARSEARCH;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class CountEvenNumberOfDigitsInHasNumberInTheArray {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
    }
    public int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)) count++;
        }
        return count;
    }

    // function to check the given number is even or not
    static  boolean even(int num){
        
    }
}
