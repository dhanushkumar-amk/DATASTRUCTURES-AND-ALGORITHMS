package PATTERNS;

public class pattern52 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch;

        for (int i = 1; i <= rows; i++)
        {
            ch = 'A';

            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");

                ch++;
            }

            System.out.println();
        }
    }
}
