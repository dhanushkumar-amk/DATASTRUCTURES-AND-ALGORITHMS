package RECURSION;

public class SumOfISeprateDigits {
    public static void main(String[] args) {
        int n = 111111;
        System.out.println(sum(n));
    }
    static  int sum(int n){
        // base case
        if( n == 0)
            return 0;

        return sum(n/10) + (n%10);
    }
}
