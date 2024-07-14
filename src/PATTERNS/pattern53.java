package PATTERNS;

public class pattern53 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch;

        for (int i = 1; i <= rows; i++)
        {
            ch = 'Z';

            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");

                ch--;
            }

            System.out.println();
        }
    }
}

/*
Z
Z Y
Z Y X
Z Y X W
Z Y X W V
 */
