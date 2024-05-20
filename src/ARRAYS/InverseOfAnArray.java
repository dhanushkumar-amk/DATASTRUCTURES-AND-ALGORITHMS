package ARRAYS;

public class InverseOfAnArray {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 0, 4 };

        System.out.println("Before Inverse");
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }

        int[] SecondArray = Inverse(nums);
        System.out.println();
        System.out.println("After Inversion");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(SecondArray[i] + " ");
        }
    }
    static int[] Inverse(int[] nums){
       int[] SecondArray = new int[nums.length];
        for (int index = 0; index <nums.length ; index++) {
            int value =  nums[index];
            SecondArray[value] =  index;
        }
        return  SecondArray;
    }
}
