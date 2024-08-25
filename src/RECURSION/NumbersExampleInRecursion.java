package RECURSION;

public class NumbersExampleInRecursion {
    public static void main(String[] args) {
        int n = 5;
        numbers(n);
    }
    static  void  numbers(int n){

        // base case
        if( n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        numbers(n + 1);
    }
}
