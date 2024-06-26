package SEARCHING.BINARYSEARCH;

public class FindTheNthRootOfAnInteger {
    public static void main(String[] args) {
int n= 3;
int m = 27;
int ans = root(n,m);
        System.out.println(ans);
    }

    static int root(int n, int m){
        int low= 1;
        int high = m;

        while(low <= high){
            int mid = (low + high)/2;
            int midN = rootValue(mid,n,m);
            if(midN == 1) return mid;
            else if(midN == 0) low = mid +1;
            else high = mid -1;
        }
        return  -1;
    }

    static int rootValue(int mid ,int n, int m){
        long ans = 1;
        for (int i = 1; i <= n ; i++) {
            ans *= mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
}
