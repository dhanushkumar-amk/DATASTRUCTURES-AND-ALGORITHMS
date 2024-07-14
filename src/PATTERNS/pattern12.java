package PATTERNS;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static  void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
