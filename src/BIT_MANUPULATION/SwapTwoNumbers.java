package BIT_MANUPULATION;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a ^ b;
        b = b ^ a;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }


}
