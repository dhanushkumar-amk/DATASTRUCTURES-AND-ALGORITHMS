package RECURSION;

public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    static  void  print(int n){
        // base case
        if(n == 0)
            return;

        System.out.println(n);
        // recursive case
        print(n - 1);
    }
}
