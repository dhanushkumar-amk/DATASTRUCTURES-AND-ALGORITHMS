package BIT_MANUPULATION;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }


}
