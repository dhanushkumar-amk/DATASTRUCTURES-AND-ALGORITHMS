package ZZZZZ.Accenture;

import java.util.ArrayList;
import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
    int n = 5;
    int[] arr = {3,4,1,7,9};
        System.out.println(divide(n,arr));

    }
    static int divide(int n, int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            if(i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

      Arrays.sort(even, even.getFirst(), even.getLast());
      Arrays.sort(odd, odd.getFirst(), odd.getLast());
              

        return  even.get(even.size()-2) + odd.get(odd.size()-2);

    }
}
