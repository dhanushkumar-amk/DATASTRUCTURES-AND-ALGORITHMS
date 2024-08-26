package RECURSION;

public class ProductOfSeperateDigit {
    public static void main(String[] args) {
        int n = 55;
        System.out.println(product(n));
    }
    static  int product(int n){
        // if there is an n is a last number just return that number
        if( n % 10 == n)
            return n;

        // recursive case
        return product(n / 10) * (n % 10);
    }
}
