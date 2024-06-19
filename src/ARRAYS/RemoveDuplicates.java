package ARRAYS;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,4,4,5,6,6,7,8};
        System.out.println(RemoveElements(nums));
        System.out.println(rmDuplicates(nums));
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
    // using two pointers method

    static int rmDuplicates(int[] nums){
        int i = 0;
        for (int j = 1; j <nums.length ; j++) {
           if(nums[i] != nums[j]){
               i++;
               nums[i+1] = nums[j];
           }
        }
        return  i + 1;
    }
}
