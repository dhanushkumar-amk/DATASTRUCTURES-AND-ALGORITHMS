package ARRAYS;

public class FrequencyElementInArray {
    public static void main(String[] args) {
        int[] nums = {20,20,30,30,30,30};

FreqElement(nums);
    }
    public static  void FreqElement(int[] nums){
        int frequency = 1;
        int i =1;
        while (i<nums.length){
            while(i< nums.length && nums[i] == nums[i-1]){
                frequency += 1;
                i++;
            }
            System.out.println(nums[i-1] + " " + frequency);
        }
    }
}
