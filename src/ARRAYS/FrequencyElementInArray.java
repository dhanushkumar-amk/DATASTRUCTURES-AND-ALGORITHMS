package ARRAYS;

public class FrequencyElementInArray {
    public static void main(String[] args) {
        int[] nums = {20,20,30,30,30,30,10};

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
            frequency = 1;
            i++;
        }

//        if the only one value is avalible then return nums[i] and frequency = 1
        if( nums.length==1 || nums[i-1] != nums[i-2])
        {
            System.out.println(nums[i-1] + " " + frequency);

        }
    }
}
