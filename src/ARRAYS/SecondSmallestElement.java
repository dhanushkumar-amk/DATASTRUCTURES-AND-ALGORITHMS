package ARRAYS;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int[] nums = {100,78,34,65, 70};

        System.out.println(SecondSmallest(nums));
    }
    static int SecondSmallest(int[] nums){
        int min1 = 0;
        int min2 = 0;
        int n = nums.length;

        if(nums[0] < min1){
            min1 = nums[0];
            min2 = nums[1];
        }
        else {
            min1 = nums[1];
            min2 = nums[0];
        }


        for (int i = 2; i <n ; i++) {
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
            }
            else if(nums[i] < min2){
                min2 = nums[i];
            }
        }

        return min2;
    }
}
