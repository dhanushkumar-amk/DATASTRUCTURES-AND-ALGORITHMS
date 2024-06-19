package ARRAYS;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int[] nums = {100,78,34,65, 70};

//        System.out.println(SecondSmallest(nums));
        System.out.println(secondSmallestElement(nums));
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


    // another method

    static int secondSmallestElement(int nums[]){
        int n = nums.length;

        if(n < 2) return -1;
        int smallestElement = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {
            if(nums[i] < smallestElement){
                secondSmallest = smallestElement;
                secondSmallest = nums[i];
            } else if (nums[i] < secondSmallest  && nums[i] != smallestElement ) {
                secondSmallest = nums[i];
            }

        }
        return  secondSmallest;
    }
}
