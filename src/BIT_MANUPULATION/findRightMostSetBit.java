package BIT_MANUPULATION;

public class findRightMostSetBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(positionOfRightMostSetBit(n));
    }
    static int positionOfRightMostSetBit(int n){
        int mask = 1;
        int position = 0;
        // base case
         if(n == 0) return -1;
        while((n & mask) == 0 ){
            mask = mask << 1;
            position++;
        }
        return position + 1;
    }
}
