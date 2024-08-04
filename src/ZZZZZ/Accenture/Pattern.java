package ZZZZZ.Accenture;

public class Pattern {
    public static void main(String[] args) {
       int n = 4;
       pattern(n);
    }
    static  void pattern(int n){
        int spaces = 2*n- 2;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <i ; j++)
                System.out.println(i);

            for (int j = 0; j < spaces ; j++)
                System.out.println(" ");
        }
    }
}
