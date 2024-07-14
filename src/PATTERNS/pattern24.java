package PATTERNS;

public class pattern24 {
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

            //Printing i to 2*i value at the end of each row

            for (int j = i; j < 2*i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
