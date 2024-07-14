package PATTERNS;

public class pattern46 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows; j++)
            {
                if (i == 1 || j == 1 || j == rows || i == rows)
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

/*
 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 */