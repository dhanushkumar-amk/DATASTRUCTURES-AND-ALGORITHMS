package PATTERNS;

public class pattern37 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        int num = 1;

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num+" ");

                num++;
            }

            System.out.println();
        }

    }
}

/*
1 2 3 4 5
6 7 8 9
10 11 12
13 14
15
 */