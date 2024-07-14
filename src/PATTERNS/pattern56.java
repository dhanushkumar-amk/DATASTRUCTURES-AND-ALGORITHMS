package PATTERNS;

public class pattern56 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch;

        //Printing upper half of the pattern

        for (int i = 1; i <= rows; i++)
        {
            ch='A';

            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--)
            {
                System.out.print(ch+" ");

                ch++;
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = rows-1; i >= 1; i--)
        {
            ch='A';

            for (int j = 2*rows-i; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--)
            {
                System.out.print(ch+" ");

                ch++;
            }

            System.out.println();
        }
    }
}
