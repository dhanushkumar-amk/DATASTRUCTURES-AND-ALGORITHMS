package ZZZZZ.Accenture;

public class SumOfprimeNumberLessThanN {
    public static void main(String[] args) {
    int n = 10;
        System.out.println(sumOfPrime(n));
    }
    static  int sumOfPrime(int n){
        int sum = 0;

        if(n <= 1)
            return  0;

        for (int i = 3; i <=n ; i++) {
            if(n % i != 0)
                sum += i;
        }

        return  sum;
    }

}
