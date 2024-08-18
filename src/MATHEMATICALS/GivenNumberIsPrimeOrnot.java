package MATHEMATICALS;

public class GivenNumberIsPrimeOrnot {
    public static void main(String[] args) {
        int n = 19;
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

        for (int i = 2; i <n; i++) {
            if(n % i == 0)
                return  false;
        }
        return  true;
    }
}
