import java.util.ArrayList;

import java.util.Collections;

public class DivideArray {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 4, 1, 7, 9};
        System.out.println(divide(n, arr));
    }

    static int divide(int n, int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        // Sorting even and odd ArrayLists
        Collections.sort(even);
        Collections.sort(odd);

        // Getting the second largest elements
        int evenSecondLargest = even.get(even.size() - 2);
        int oddSecondLargest = odd.get(odd.size() - 2);

        return evenSecondLargest + oddSecondLargest;
    }
}
