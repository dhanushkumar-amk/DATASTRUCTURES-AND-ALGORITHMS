package ARRAYS;

public class LeftRotationOfArrayByIOnePlace {
    public static void main(String[] args) {

    }


static void LeftRotation(int[] nums, int n){
        int temp = nums[0];

    for (int i = 0; i <n; i++) {
        nums[i] = nums[i+1];
    }

    nums[i-1] = temp;

    for (int i = 0; i < n; i++) {
        System.out.println(nums[i] + " ");
    }

}
}

