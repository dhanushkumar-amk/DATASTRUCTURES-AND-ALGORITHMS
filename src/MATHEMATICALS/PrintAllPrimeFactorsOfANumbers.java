package MATHEMATICALS;

import java.util.ArrayList;

public class PrintAllPrimeFactorsOfANumbers {
    public static void main(String[] args) {
      int n = 60;
      ArrayList<Integer> ans = primeFactors(n);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i));
        }
    }
    static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i * i <= n ; i++) {
            if( n % i == 0){
                list.add(i);
            }
        }

        return  list;
    }
}
