package ARRAYS;


public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
        int answer = Majority(nums);
        System.out.println(answer);
    }
    static int Majority(int[] nums){
        int count = 0;
        int element = 0;
        int n = nums.length;

        for (int i = 0; i <n; i++) {
            if(count == 0){
                count++;
            element = nums[i];
            }

           else if(element == nums[i]) count++;
            else  count--;
        }

        for (int i = 0; i <n ; i++) {
            int finalCount = 0;

            if(element == nums[i]) count++;
            if(finalCount >= (n/2)) return  element;
        }
        return -1;
    }
}
