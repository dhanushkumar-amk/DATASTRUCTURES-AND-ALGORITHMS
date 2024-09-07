package RECURSION;

public class RopeCuttingProblemInRecursion {
    public static void main(String[] args) {
        int n = 15;
        int a = 5;
        int b = 7;
        int c = 8;
        System.out.println(maxPieces(n,a,b,c));
    }
    static  int maxPieces(int n, int a, int b, int c){

        // base case
        if(n == 0)
            return 0;  // for successfully cut
        else if(n < 0)
            return -1; // for unsuccessfully cut


        // recursive call
        int temp1 = maxPieces(n-a,  a, b, c);
        int temp2 = maxPieces(n-b,  a, b, c);
        int temp3 = maxPieces(n-c,  a, b, c);

      int pieces = Math.max(temp3,Math.max(temp1, temp2));

        if(pieces == -1)
            return -1;
        else
            return pieces+1;
    }
}
