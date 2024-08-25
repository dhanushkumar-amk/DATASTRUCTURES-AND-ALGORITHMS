package MATHEMATICALS;

public class EuclideanAlgorithms {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(gcd(a,b));
    }
    static  int gcd(int a, int b){
        if(a==0)
            return b;

        return gcd(b % a, a);
    }
}
