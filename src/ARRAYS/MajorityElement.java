package ARRAYS;


public class MajorityElement {
    public static void main(String[] args) {

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

            if(element == nums[i]) count++;
            else  count--;
        }

        return 0;
    }
}
