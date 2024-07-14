package PATTERNS;

public class pattern38 {
    public static void main(String[] args) {
        int rows = 5;
        pattern(rows);
    }
    static void pattern(int rows){
        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }

            for (int k = 1; k < i; k++)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}

/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
 */