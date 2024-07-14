package BIT_MANUPULATION;

public class ComputeXorOperator {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(computeXOR(n));
    }
    public static int computeXOR(int n)
    {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        else
            return 0;
    }
}
