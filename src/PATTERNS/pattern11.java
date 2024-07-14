package PATTERNS;

public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static  void pattern(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */