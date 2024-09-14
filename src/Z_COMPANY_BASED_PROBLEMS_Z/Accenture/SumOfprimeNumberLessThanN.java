package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class SumOfprimeNumberLessThanN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfPrime(n));
    }

    static int sumOfPrime(int n) {
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
