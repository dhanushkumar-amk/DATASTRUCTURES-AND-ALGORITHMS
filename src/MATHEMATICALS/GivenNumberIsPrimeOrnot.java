package MATHEMATICALS;

public class GivenNumberIsPrimeOrnot {
    public static void main(String[] args) {
        int n = 9;
        if(isPrime(n) == true) {
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    static  boolean isPrime(int n){
        if(n <= 1)
            return  false;
        for (int i = 2; i*i <=n; i++) {
            if(n % i == 0)
                return  false;
        }
        return  true;
    }
}
