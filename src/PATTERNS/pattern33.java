package PATTERNS;

public class pattern33 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(1);
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

/*
11111
11122
11333
14444
55555
 */