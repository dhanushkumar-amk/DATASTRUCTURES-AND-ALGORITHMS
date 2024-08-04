package RECURSION;

public class GCDOF2NUMBERS {
    public static void main(String[] args) {
      int a = 25;
      int b = 11;
        System.out.println(gcd(a, b));
    }
    static  int gcd(int a, int b){
        // base case
        if(b == 0)
            return a;

        // recursive case
        return  gcd(b, a % b);
    }
}
