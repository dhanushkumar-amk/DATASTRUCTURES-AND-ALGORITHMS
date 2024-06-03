package ARRAYS;

// span = max - min;
public class SpanOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(SpanArray(nums));
    }
    static int SpanArray(int[] nums){
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] > max ) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        int span =  max - min;
      return span;
    }

}
