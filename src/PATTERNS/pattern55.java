package PATTERNS;

public class pattern55 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch;

        for (int i = rows; i >= 1; i--)
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

/*
A B C D E
A B C D
A B C
A B
A
 */