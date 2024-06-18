package ARRAYS;

public class ARRAYISSORTED1 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        System.out.println(sorted(nums));
    }
    public static boolean sorted(int nums[]){
        for (int i = 0; i <nums.length-1; i++) {
            if (nums[i] >nums[i-1]) {
                return true;
            }
            else{
                continue;
            }
        }

        return false;
    }
}
