package ARRAYS;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {10,22,12,3,0,6};
        int n = 6;

        ArrayList<Integer> result = Leaders(nums, n);

        for(int i = 0; i <result.size() ; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
    public  static ArrayList<Integer> Leaders(int[] nums, int n){
    ArrayList<Integer> ans = new ArrayList<>();
     // int max = Integer.MIN_VALUE;

        int max = nums[n-1];

        //the last element of an array always be a leader
        ans.add(nums[n-1]);
        for (int i = n-2; i >= 0 ; i--) {
            if(nums[i] > max){
                ans.add(nums[i]);
                max =nums[i];
            }
        }
        return ans;
    }
}

