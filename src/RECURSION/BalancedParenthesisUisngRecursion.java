package RECURSION;

public class BalancedParenthesisUisngRecursion {
    public static void main(String[] args) {
        int n = 3;
        char[] arr = new char[n * 2];
        paren(arr, n, 0,0,0);
    }

    static  void paren(char[] arr, int n, int i, int opening, int closing){

        // base case
        if( i == arr.length)
            System.out.println(arr);

        if(opening < n){
            arr[i] = '(';
            paren(arr,n,i+1,opening+1, closing);
        }

        if(closing < n){
            arr[i] = ')';
            paren(arr,n,i+1, opening, closing+1);
        }
    }
}
