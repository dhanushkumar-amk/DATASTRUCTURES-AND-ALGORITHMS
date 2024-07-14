package PATTERNS;

public class pattern27 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = rows; i >= 1; i--)
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
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */