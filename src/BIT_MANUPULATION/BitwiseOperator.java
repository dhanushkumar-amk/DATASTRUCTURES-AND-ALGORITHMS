package BIT_MANUPULATION;

public class BitwiseOperator {
    public static void main(String[] args) {
        // basic operator
        System.out.println( 5 | 9); // 13
        System.out.println(5 & 9); // 1
        System.out.println(5 ^ 9); // 12

    // advance operator
        System.out.println(  5 << 1); // multiple by 2  power 1
        System.out.println(5 << 2); // multiple by 2 power 2
        System.out.println(5 >> 1); // divide ny 2 power 1
        System.out.println(5 >> 2); // divide by 2  power 2
        System.out.println(~1);
    }
}
