package ARRAYS;

import java.util.ArrayList;

public class CountInversion {

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid - left + 1); // Count inversions
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static int numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int n = a.length;
        int cnt = numberOfInversions(a, n);
        System.out.println(cnt);
    }
}
