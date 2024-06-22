package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,-4,-5,7,-6));
ArrayList<Integer> ans = RearrangThValueBySign(a);
        for (int i = 0; i < ans.size() ; i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
    public static ArrayList<Integer> RearrangThValueBySign(ArrayList<Integer> a){
        int n = a.size();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));

        int positiveValue = 0;
        int negativeValue = 1;

        for (int i = 0; i <n ; i++) {
            if(a.get(i) < 0){
                ans.set(negativeValue, a.get(i));
                negativeValue += 2;
            }
            else{
                ans.set(positiveValue, a.get(i));
                positiveValue += 2;
            }
        }
        return  ans;
    }
}
