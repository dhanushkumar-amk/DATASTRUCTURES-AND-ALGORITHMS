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
        int finalCount = 0;
        for (int i = 0; i <n ; i++) {


            if(element == nums[i]) finalCount++;
            if(finalCount >= (n/2)) return  element;
        }
        return -1;
    }
}
