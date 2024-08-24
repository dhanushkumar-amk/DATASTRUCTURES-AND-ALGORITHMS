package MATHEMATICALS;

public class FactorsOfANumber {
    public static void main(String[] args) {
        factors(40);
    }
    static  void factors(int n){
        for (int i = 1; i <= n ; i++) {
            if( n % i == 0)
                System.out.print( i + " ");
        }
    }
}
