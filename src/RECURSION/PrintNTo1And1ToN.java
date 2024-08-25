package RECURSION;

public class PrintNTo1And1ToN {
    public static void main(String[] args) {
        int n = 5;
printBoth(n);
    }
static  void printBoth(int n){
        if(n == 0)
            return;

    System.out.println(n); // for n to 1
    printBoth(n - 1);
    System.out.println(n); // for 1 to n

    }
}
