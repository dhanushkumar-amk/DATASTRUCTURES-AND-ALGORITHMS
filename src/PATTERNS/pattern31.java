package PATTERNS;

public class pattern31 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }

    static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) { // the number is even then puut 0
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }

            System.out.println();
        }
    }
}