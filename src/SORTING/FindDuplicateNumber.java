package SORTING;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        int ans =  findDuplicate(nums);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] nums) {
    int i = 0;
    while(i < nums.length) {

        if (nums[i] != i + 1) {
            int currentIndex = nums[i] - 1;
            if (nums[i] != nums[currentIndex]) {
                int temp = nums[i];
                nums[i] = nums[currentIndex];
                nums[currentIndex] = temp;
            } else{
                return nums[i];
            }
        }else i++;
    }

    return -1;
    }
}
