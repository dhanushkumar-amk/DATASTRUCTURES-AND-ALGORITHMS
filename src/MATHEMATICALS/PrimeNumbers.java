package MATHEMATICALS;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(n + " is a prime " +isPrime(n));
    }
    static boolean isPrime(int n){

        if(n <= 1)
            return  false;

        int c = 2;

        while( c * c <= n){
            if(n % c == 0)
                return  false;
            c++;
        }

        return true;
    }
}
