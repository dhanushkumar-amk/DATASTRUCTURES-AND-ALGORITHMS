package ARRAYS;

// leetcode 238
public class productOfAnArrayExpectIteself {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = ProductExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
                System.out.println(result[i]);
        }
    }

    public static int[] ProductExceptSelf(int[] nums){
        int n = nums.length;
        int prefixValue = 1;
        int postfixValue = 1;

        int resultArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            resultArr[i] = 1;
        }

        // prefix value;

        for (int i = 0; i < n; i++) {
            resultArr[i] *= postfixValue;
            postfixValue *= nums[i];
        }

        for (int i = n-1; i >= 0; i--) {
            resultArr[i] *= prefixValue;
            prefixValue *= nums[i];
        }
        return resultArr;
    }

    // another way

}
