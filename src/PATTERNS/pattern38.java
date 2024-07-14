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
