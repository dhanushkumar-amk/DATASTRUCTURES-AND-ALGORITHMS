package PATTERNS;

public class pattern34 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if(i == j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }
}

/*
00000
01000
00200
00030
00004
 */