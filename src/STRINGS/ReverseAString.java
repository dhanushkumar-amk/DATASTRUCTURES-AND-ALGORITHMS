package STRINGS;
import java.lang.StringBuilder;

public class ReverseAString {
    public static void main(String[] args) {
        String s = 
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
