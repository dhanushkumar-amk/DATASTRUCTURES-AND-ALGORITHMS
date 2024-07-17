package BIT_MANUPULATION;

public class ReversingTheBitsOfAnInteger {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(reverseBits(n));
    }
    static  int reverseBits(int n){
      int f = 31;
      int l = 0;
      int reverse = 0;
      while (f > l){
         if((n & (1<<f)) != 0){
             reverse = reverse | ( 1 << l);
         }
         if((n & (1<<l)) != 0){
             reverse = reverse | (1 << f);
         }
         f--;
         l++;
      }
      return  reverse;
    }
}
