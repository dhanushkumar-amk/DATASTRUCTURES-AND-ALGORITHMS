package ARRAYS;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1,1,3};
        System.out.println(numInenticalPairs(nums));
    }
    public static int numInenticalPairs(int[] nums){
         int[] count = new int[102];

         for(int num : nums)
             count[num]++;

         int totalCount = 0;

         for(int index : count)
             totalCount += ((index) * (index - 1))/2;

         return  totalCount;
    }
}
