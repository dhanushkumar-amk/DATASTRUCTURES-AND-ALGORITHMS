package PATTERNS;

public class pattern47 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i || i == rows)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
