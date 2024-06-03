package BIT_MANUPULATION;

public class SingleNonRepeatingNumber {
    public static void main(String[] args) {
        int[] nums ={1,2,1,4,4};
        System.out.println(NonRepeatingElement(nums));
    }
    public static int NonRepeatingElement(int[] nums){
        int element = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            element = element ^ nums[i];
        }
        return  element;
    }
}
