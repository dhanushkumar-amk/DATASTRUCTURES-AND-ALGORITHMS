package ARRAYS;

// leetcode 238
public class productOfAnArrayExpectIteself {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        for (int i = 0; i <nums.length-1 ; i++) {
            System.out.println(ProductExceptItself(nums));
        }
    }
    public int[] ProductExcecptSelf(int[] nums){
        int n = nums.length-1;
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

        for (int i = n-1; i <=0 ; i--) {
            resultArr[i] *= postfixValue;
            postfixValue *= nums[i];
        }
        return  resultArr;
    }


}
