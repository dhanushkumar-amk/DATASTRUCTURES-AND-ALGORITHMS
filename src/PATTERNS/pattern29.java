package PATTERNS;

public class pattern29 {
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

            //Printing rows to i value at the end of each row

            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}
