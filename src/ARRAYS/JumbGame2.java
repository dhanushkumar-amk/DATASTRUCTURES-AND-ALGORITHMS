package ARRAYS;

public class JumbGame2 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 4, 5 };
        System.out.println(jumpGame(nums));
    }

    static int jumpGame(int[] nums) {
        int destination = nums.length - 1;
        int totalJump = 0;
        int lastIndexJump = 0;
        int coverage = 0;

        // base condition
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastIndexJump) {
                lastIndexJump = coverage;
                totalJump++;
                if (coverage >= destination)
                    return totalJump;
            }
        }
        return totalJump;
    }
}
