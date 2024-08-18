package MATHEMATICALS;

import java.util.ArrayList;

public class PrintAllTheDivisorOfN {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> ans = divisor(n);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.println(ans.get(i));
        }
    }
    static ArrayList<Integer> divisor (int n){
        ArrayList<Integer> list = new ArrayList<>();

//        for (int i = 1; i <Math.sqrt(n) ; i++) {
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                list.add(i);

                if(n / i != i)
                    list.add(n/i);
            }

        }
        return  list;
    }
}
