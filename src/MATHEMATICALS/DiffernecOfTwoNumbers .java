class DiffernecOfTwoNumbers {
    public static void main(String[] args) {
      int m = 20;
      int n = 4;
      System.out.println(difference(m,n));
    }
    public static int difference(int m, int n){
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 1; i <= m; i++){
            if(i % n == 0) sum1 += i;
            else sum2 += i;
        }
        int ans = Math.abs(sum1 - sum2);
        return ans;
    }
}
