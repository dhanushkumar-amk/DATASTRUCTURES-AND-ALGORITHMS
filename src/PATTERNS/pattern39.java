package PATTERNS;

public class pattern39 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
//Printing upper half of the pattern

        for (int i = rows; i >= 1; i--)
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            for (int j = 1; j < (2*i)-1; j++)
            {
                System.out.print(i+" ");
            }

            for (int j = i+1; j <= rows; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        //Printing lower half of the pattern

        for (int i = 2; i <= rows; i++)
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            for (int j = 1; j < (2*i)-1; j++)
            {
                System.out.print(i+" ");
            }

            for (int j = i+1; j <= rows; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
