package RECURSION;

// recursion is calls  function calls itself

public class NumbersExampleInRecursion {
    public static void main(String[] args) {
        numbers(1);
    }
    static  void  numbers(int n){

        // base case
        if( n == 5) {
            System.out.println(5);
            return;
        }

        // recursive case

        // print
        System.out.println(n);

        // call
        numbers(n + 1);
    }
}
