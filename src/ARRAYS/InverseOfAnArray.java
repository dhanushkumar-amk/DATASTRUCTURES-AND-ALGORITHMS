package ARRAYS;

public class InverseOfAnArray {
    public static void main(String[] args) {

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
