package BIT_MANUPULATION;

public class BinaryNumberWithAlternativeBits {
    public static void main(String[] args) {
int n = 10;
        System.out.println(alternativeBits(n));
    }
    static boolean alternativeBits(int n){
        int xor = n ^ (n >> 1);

        if(((xor + 1) & xor) == 0) return true;
        else return  false;
    }
}
