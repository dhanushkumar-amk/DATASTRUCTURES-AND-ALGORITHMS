package SEARCHING.BINARYSEARCH;

public class KthMissingPositiveNumber {
    public static int missingK(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(arr, n, k);
        System.out.println("The missing number is: " + ans);
    }
}
