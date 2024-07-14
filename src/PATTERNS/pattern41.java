package PATTERNS;

public class pattern41 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 1; i <= rows; i++)
        {
            //Printing rows-i spaces at the beginning of each row

            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }

            //Printing i stars at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = rows-1; i >= 1; i--)
        {
            //Printing rows-i spaces at the beginning of each row

            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }

            //Printing i stars at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

 */