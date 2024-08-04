package ZZZZZ.Accenture;

import java.util.HashMap;

public class SocksMerchant {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 3, 2}; // Example array of socks
        int n = arr.length;
        int pairs = sock(arr, n);
        System.out.println("Number of pairs: " + pairs);
    }

    static int sock(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each sock color
        for (int i = 0; i < n; i++) {
            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], count + 1);
        }

        int pairs = 0;
        // Count pairs of each color
        for (int count : map.values()) {
            pairs += count / 2;
        }

        return pairs;
    }
}
