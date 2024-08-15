package ARRAYS;

public class MinimumOperationTOMakeArrayEqualToTarget {
    public static  long minimumOperations(int[] nums, int[] target) {
        int n = nums.length;
        int[] diff = new int[n];

        // Calculate the difference between nums and target
        for (int i = 0; i < n; i++) {
            diff[i] = nums[i] - target[i];
        }

        long ans = 0;
        long inCop = 0;
        long deCop = 0;

        for (int i = 0; i < n; i++) {
            if (diff[i] > 0) {
                if (inCop < diff[i]) {
                    long extra = diff[i] - inCop;
                    ans += extra;
                }
                inCop = diff[i];
                deCop = 0;
            } else if (diff[i] < 0) {
                if (deCop < -diff[i]) {
                    long extra = -diff[i] - deCop;
                    ans += extra;
                }
                deCop = -diff[i];
                inCop = 0;
            } else {
                inCop = 0;
                deCop = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Default arrays
        int[] nums = {3, 1, 5, 7};
        int[] target = {1, 2, 3, 4};

        System.out.println(minimumOperations(nums, target));
    }

}
