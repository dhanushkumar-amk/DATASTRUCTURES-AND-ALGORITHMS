package BIT_MANUPULATION;

public class ConvertDecimalNumberToBinary {
    public static void main(String[] args) {
    int n = 45;
        System.out.println(decimalToBinary(n));

    }
    static  String decimalToBinary(int n) {

        String b = ""; // used to concat the  remainder one by one so we use string
        while (n >= 1) {
            int x = n % 2; // store the remainder of the n
            n /= 2;
            b = x + b;  // x + b because we can return the value in reverse order
        }
        return b;
    }
}
