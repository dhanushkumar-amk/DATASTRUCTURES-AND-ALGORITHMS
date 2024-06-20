package ARRAYS;

public class LeftRotationOfArrayByIOnePlace {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        LeftRotation(nums);
    }

    static void LeftRotation(int[] nums){
     int temp = nums[0];
     int n = nums.length-1;
int i;
        for ( i = 0; i <n-1 ; i++) {
            nums[i] = nums[i+1];
        }
        nums[i-1] =  temp;

        for (int j = 0; j <n ; j++) {
            System.out.println(nums[i] + " "  );
        }
    }
}
