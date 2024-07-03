package SORTING;
import  java.util.*;
class FindAllDisapperingNumber {

    public static void main(String[] args) {
     int[] nums = {4,3,2,7,8,2,3,1};
     List<Integer> ans = findDisappearedNumbers(nums);

        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
int i = 0;
while (i < nums.length){
    int correctIndex = nums[i]-1;
    if(nums[i] != nums[correctIndex]){
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
       }  else i++;
     }
// just find missing number
       List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            if(nums[index] != index+1)
                ans.add(index+1);
        }
return ans;
    }
}
