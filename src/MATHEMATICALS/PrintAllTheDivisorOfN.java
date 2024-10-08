package MATHEMATICALS;

import java.util.ArrayList;

public class PrintAllTheDivisorOfN {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> ans = divisor(n);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    static ArrayList<Integer> divisor (int n){
        ArrayList<Integer> list = new ArrayList<>();

//        for (int i = 1; i <Math.sqrt(n) ; i++) { // for reduce time complexity use i * i instead of Math.sqrt(n)
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                list.add(i);

                // for not repeating same number
                if(n / i != i)
                    list.add(n/i);
            }
        }
        return  list;
    }
}
