package ARRAYS;

// leetcode 238
public class productOfAnArrayExpectIteself {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
//        int result[] = ProductExceptSelf(nums);
        int result1[] = productExceptSelf1(nums);
        for (int i = 0; i < nums.length; i++) {
                System.out.println(result1[i]);
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
    public static  int[] productExceptSelf1(int nums[]){

            int left[] = new int [nums.length];
            int right[] = new int[nums.length];

            left[0] = 1;
        for (int i = 1; i <nums.length; i++) {
            left[i]= left[i-1] * nums[i-1];
        }

        right[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0 ; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
         int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

            return ans;
    }



}
