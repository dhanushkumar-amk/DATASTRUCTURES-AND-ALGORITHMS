package BIT_MANUPULATION;

import static java.lang.Math.log10;

public class findRightMostSetBit {
    public static void main(String[] args) {
        int n = 10;
        //System.out.println(positionOfRightMostSetBit(n));
        System.out.println(positionOfRightMostSetBit1(n));
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

    // efficent solution
    static int positionOfRightMostSetBit1(int n){
        return(int)Math.log10(n ^ (n & (n - 1 ))) / Math.log10(2);
    }


}
