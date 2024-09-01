package MATHEMATICALS;

public class ViralAdvertisingInHackerRank {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(advertising(n));
    }
    static  int advertising(int n){

        int shared = 5;
        int liked = 0;
        int totalLiked = 0;

        for (int i = 1; i <=n ; i++) {

            liked = shared / 2;
            totalLiked += liked;
            shared = liked * 3;

        }
        return  totalLiked;
    }
}
