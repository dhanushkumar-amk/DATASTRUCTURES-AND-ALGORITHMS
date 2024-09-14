package ZZZZZ.Accenture;

public class CountStringPermutation {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(CountString(s));
    }
    static  int CountString(String s){

        int[] arr = new int[26];

        for (int i = 0; i <s.length() ; i++) {
            int index = (int) s.charAt(i) - 97;
            arr[index]++;
        }

        int ans = factorial(s.length());


        for (int i = 0; i < 26; i++) {
            if(arr[i] > 1)
                ans = ans /factorial(arr[i]);
        }
        return  ans;
    }
    static  int factorial(int n){
        int res = 1;
        for (int i = 2; i <=n ; i++)
            res *= i;
        return  res;
    }


}
