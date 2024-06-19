package ARRAYS;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4,5,6,6,7,8};
        System.out.println(RemoveElements(nums));
    }
 static  int RemoveElements(int[] nums){
        int count = 0;
     for (int i = 0; i <nums.length ; i++) {
         if(i < nums.length-1 && nums[i] == nums[i+1]) continue;
         else nums[count] = nums[i];
         count++;
     }
     return  count;
 }

 // another way
    

}
