package STRINGS;

public class RepeatedString {
    public static void main(String[] args) {
String s = "abab";
int n = 10;
        System.out.println(repeat(s,n));
    }
    static  int repeat(String s, int n){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
       count  =  count * (n/s.length());

        for (int i = 0; i < n % s.length() ; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }

        return count;
    }
}
