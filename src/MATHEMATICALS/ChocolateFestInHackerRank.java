package MATHEMATICALS;

public class ChocolateFestInHackerRank {
    public static void main(String[] args) {
        int n = 15;
        int c = 3;
        int m = 2;
        System.out.println(chocalateFeast(n,c,m));
    }
    static  int chocalateFeast(int n, int c, int m){

        int choco = n/c;
        int wrap = choco;

        int new_Choco = 0;

        while(wrap >= m){
            new_Choco = wrap / m;
            choco += new_Choco;
            wrap = (wrap % m) + new_Choco;
        }
        return  choco;
    }
}
