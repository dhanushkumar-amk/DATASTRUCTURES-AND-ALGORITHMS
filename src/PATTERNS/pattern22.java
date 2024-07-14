package PATTERNS;

public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <=n; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = n-1; i >= 1; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= n; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
