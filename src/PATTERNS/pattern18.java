package PATTERNS;

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){


        for (int i = 1; i <= n; i++)
        {
            //Printing first half of the row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            //Printing second half of the row

            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
