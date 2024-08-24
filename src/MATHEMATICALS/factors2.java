package MATHEMATICALS;

public class factors2 {
    public static void main(String[] args) {
        System.out.println(factors(n));
    }
    static  void factors(int n){
        for (int i = 1; i * i <= n  ; i++) {
            if( n % i == 0){
                if(n / i == i)
                    System.out.print( i + " ");
                else
                    System.out.print( i + " " + n/i);
            }
        }
    }
}
