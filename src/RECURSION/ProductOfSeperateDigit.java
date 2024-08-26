package RECURSION;

public class ProductOfSeperateDigit {
    public static void main(String[] args) {
        int n = 1111;
        System.out.println(product(n));
    }
    static  int product(int n){
        if( n == 0)
            return 0;

        return product(n / 10) * (n % 10);
    }
}
