package ZZZZZ.Accenture;
import  java.lang.String;

public class ReplaceFrequent {
    public static void main(String[] args) {
        String s = "bbc";
        char x = 'x';
        System.out.println(replace(s,x));
    }
    static String replace(String s, char x){
        int[] arr = new int[26];
        arr = new int[]{26};

        for (int i = 0; i <s.length() ; i++) {
            int index = (int) s[i] - 97;
            arr[index]++;
        }
        int max = 0;
        char max_char = 0;
        for (int i = 0; i <s.length() ; i++) {
            int index;
             index = (int) s[i] - 97;
            if(arr[index] > max){
                max = arr[index];
                max_char = s[i];
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(s[i] == max_char){
                s[i] =x;
            }
        }
        return  s;
    }
}
