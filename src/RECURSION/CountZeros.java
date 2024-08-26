package RECURSION;

public class CountZeros {
    public static void main(String[] args) {
      int n = 100000;
        System.out.println(count(n));
    }
    static  int count(int n){
        // fro returning the argument  of an base case
        return  helper(n,0);
    }

    private static int helper(int n, int c) {

        // base case
        if(n == 0)
            return  c;

        int rem = n % 10;

        // recursive case
        if( rem == 0)
            return helper(n/10, c+1);
        else
            return helper(n/10, c);
    }
}
