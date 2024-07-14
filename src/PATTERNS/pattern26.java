package PATTERNS;

public class pattern26 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = rows; i >= 1; i--)
        {
            //Printing rows-i spaces at the beginning of each row

            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }

            //Printing i value i times at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}

/*
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
 */