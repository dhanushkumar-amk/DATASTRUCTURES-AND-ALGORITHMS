package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class DisapperingNumbersInArray {

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 2, 8, 2, 3, 1};
        List<Integer> missingNumbers = MissingNumber(arr);
        for (int num : missingNumbers) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> MissingNumber(int[] arr) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]) - 1;  // Calculate index (handle negatives)

            if (idx < 0) {
                continue;  // Skip negative indices
            }

            // Mark the visited index by negating the value at that index
            idx *= -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {  // Check for positive values (missing numbers)
                result.add(i + 1);
            }
        }
        return result;
    }
}
