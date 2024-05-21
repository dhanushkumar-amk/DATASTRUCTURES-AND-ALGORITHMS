package STRINGS;
import java.lang.*;
public class LongestPalindromicSubString {
    public static void main(String[] args) {
String s =  "ABRBADAADAB";
        System.out.println(LongestSuStringPalindrome(s));
    }

    static String LongestSuStringPalindrome(String s) {

        // base condition
        if (s.length() <= 1) return s;

        String lps = "";

        for (int i = 1; i < s.length(); i++) {

            // check the odd character
            int left = i;
            int right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length())
                    break;

            }

            String Palindrome = s.substring(left + 1, right);
            if (Palindrome.length() > lps.length())
                lps = Palindrome;


            // tak even values
            left = i + 1;
            right = i;

            while (s.charAt(left) == s.charAt(right)) {

                left--;
                right++;

                if (left == -1 || right == s.length()) break;

            }

            Palindrome = s.substring(left + 1, right);

            if (Palindrome.length() > lps.length())
                lps = Palindrome;

        }

        return lps;

    }

}