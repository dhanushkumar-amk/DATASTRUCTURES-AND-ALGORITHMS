package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroOnetwo {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{2,1,2,0,0,1}));
        sort(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr.get(i) + ' ');
        }
    }
    static  void sort(ArrayList<Integer> arr, int n){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i <n; i++) {
            if(arr.get(i) == 0) count1++;
            else if (arr.get(i) == 1) count2++;
            else {count3++;}
        }

        for (int i = 0; i <count1 ; i++) {
            arr.set(i, 0);
        }
        for (int i = count1; i <count1+count2 ; i++) {
            arr.set(i,1);
        }

        for (int i = count1+count2; i <n ; i++) {
            arr.set(i, 2);
        }
    }
}
