package PATTERNS;

public class pattern30 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 1; i <= rows; i++)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = rows-1; i >= 1; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}

/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

 */