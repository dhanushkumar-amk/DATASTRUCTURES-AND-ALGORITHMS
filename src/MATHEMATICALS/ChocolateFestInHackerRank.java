package MATHEMATICALS;

public class ChocolateFestInHackerRank {
    public static void main(String[] args) {
        int n = 15;
        int c = 3;
        int m = 2;
        System.out.println(chocalateFeast(n,c,m));
    }
    static  int chocalateFeast(int n, int c, int m){

        int chocalate = n / c;
        int wrapper = chocalate;

        int newChocalate = 0;

        while (wrapper >= m){
            newChocalate = wrapper / m;
            chocalate += newChocalate;
            wrapper = (wrapper % m) + newChocalate;
        }



        return  chocalate;
    }
}
