package ARRAYS;

import java.util.ArrayList;

public class CountInversion {


    private static int mwerge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        int count =0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }


        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return  count;
    }

    public  static int mergeSort(int[] arr, int low, int high){
        int count =0;
        if(low >= high) return count;

        int mid = (low + high) / 2;
        count += mergeSort(arr,low, high);
        count += mergeSort(arr, mid+1, high);
        count += mergeSort(arr, low, mid, high);
        return  count;
    }


    public static  int numberofInversions(int[] a, int n){
        return  mergeSort(a,0,n-1);
    }

    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        int n = 5;
        int count = numberofInversions(a, n);
        System.out.println(count);
    }
}
