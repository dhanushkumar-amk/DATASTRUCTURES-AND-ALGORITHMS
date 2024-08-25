package RECURSION;

public class fibonacci {
    public static void main(String[] args) {
       int n = 7;
        System.out.println(fibo(n));
    }
    static  int fibo(int n){

        // base case
        if( n < 2)
            return n;

        return  fibo(n - 1) + fibo(n - 2);
    }
}
