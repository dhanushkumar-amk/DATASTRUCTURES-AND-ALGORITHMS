package RECURSION;

public class ProductOfSeperateDigit {
    public static void main(String[] args) {
        int n = 55;
        System.out.println(product(n));
    }
    static  int product(int n){
        if( n % 10 == n)
            return n;

        return product(n / 10) * (n % 10);
    }
}
