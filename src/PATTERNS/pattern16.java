package PATTERNS;

public class pattern16 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
    static void pattern(int n){
        for (int i = n; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
