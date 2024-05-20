package ARRAYS;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums= {-2,1,-3,4,-1,2,1,-5,-4};
        System.out.println();
    }

    public static int MaximumSubArray(int[] nums){
    int ToatalAmount = nums[0];
    int maxAmount =  nums[0];


        for (int i = 0; i <nums.length ; i++) {
            if(ToatalAmount >= 0){
                ToatalAmount += nums[i];
            }
            else {
                ToatalAmount = nums[i];
            }

            if(ToatalAmount > maxAmount){
                maxAmount = ToatalAmount;
            }
        }

        return  maxAmount;

    }

}
