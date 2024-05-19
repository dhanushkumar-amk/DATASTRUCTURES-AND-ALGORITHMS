package ARRAYS;

public class LeftRotationOfArrayByIOnePlace {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int n = 6;
    LeftRotation(nums,n);
    }



static void LeftRotation(int[] nums, int n){
        int temp = nums[0];
        int i;
    for ( i = 0; i <n-1; i++) {
        nums[i] = nums[i+1];
    }
    nums[i-1] = temp;
    for ( i = 0; i < n-1; i++) {
        System.out.print(nums[i] + " ");
     }
    }
}

