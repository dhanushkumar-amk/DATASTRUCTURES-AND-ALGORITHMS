package PATTERNS;

public class StairsCase {
    public static void main(String[] args) {

        int n = 5;


        for (int i = 0; i <n ; i++) {
            int spaces = n-1;
            int hash = 1;

            // print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.println(" ");
            }

            for (int j = 0; j <hash ; j++) {
                System.out.print(" # ");
            }

            spaces--;
            hash++;
        }

    }
}
