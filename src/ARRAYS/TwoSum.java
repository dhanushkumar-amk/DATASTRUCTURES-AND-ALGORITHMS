package ARRAYS;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11};
        System.out.println(Arrays.toString(sum(nums,18)));
    }


      static  int[] sum(int[] nums, int target){
         HashMap<Integer, Integer> map =  new HashMap<>();

          for (int i = 0; i <nums.length ; i++) {
              int requireNumber = target - nums[i];

              if(map.containsKey(requireNumber)){
                  int[] arr = {map.get(requireNumber), i};
                  return  arr;
              }
              else map.put(nums[i], i);
          }
return null;
    }
}
