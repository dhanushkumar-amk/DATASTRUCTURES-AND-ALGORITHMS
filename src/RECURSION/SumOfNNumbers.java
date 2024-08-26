package RECURSION;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(sum(n));
    }
    static  int sum(int n){
        if( n == 0)
            return 0;

        return n + sum(n - 1);
    }
}
