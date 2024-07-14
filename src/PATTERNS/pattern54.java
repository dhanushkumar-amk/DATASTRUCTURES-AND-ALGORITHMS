package PATTERNS;

public class pattern54 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        char ch = 'A';

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
            }

            ch++;

            System.out.println();
        }
    }
}

/*
A
B B
C C C
D D D D
E E E E E

 */