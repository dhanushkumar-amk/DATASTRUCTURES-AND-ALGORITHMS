package ZZZZZ.Accenture;

public class ReplaceFrequent {
    public static void main(String[] args) {
        String s = "bbc";
        char x = 'x';
        System.out.println(replace(s, x));
    }

    static String replace(String s, char x) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }

        int max = 0;
        char max_char = ' ';

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (arr[index] > max) {
                max = arr[index];
                max_char = s.charAt(i);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == max_char) {
                result.append(x);
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
