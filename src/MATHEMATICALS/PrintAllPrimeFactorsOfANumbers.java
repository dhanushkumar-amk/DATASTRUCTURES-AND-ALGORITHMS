package MATHEMATICALS;

import java.util.ArrayList;

public class PrintAllPrimeFactorsOfANumbers {
    public static void main(String[] args) {
      int n = 1;
      ArrayList<Integer> ans = primeFactors(n);
        for (int i = 0; i <ans.size() ; i++) {
            System.out.print(ans.get(i));
        }
    }
    static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        if(n == 1)
            list.add(0);


        return  list;
    }
}
