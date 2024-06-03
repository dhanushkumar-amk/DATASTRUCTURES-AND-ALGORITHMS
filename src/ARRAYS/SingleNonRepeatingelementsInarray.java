package ARRAYS;

public class SingleNonRepeatingelementsInarray {
    public static void main(String[] args) {
        int[] nums ={1,2,2,1,4,4, 1};
        System.out.println(NonRepeatingElement(nums));
    }
    public static  int NonRepeatingElement(int[] nums){

int elements = nums[0];

        for (int i = 1; i <nums.length ; i++) {
            elements = elements ^ nums[i];
        }
        return elements;
    }
}
