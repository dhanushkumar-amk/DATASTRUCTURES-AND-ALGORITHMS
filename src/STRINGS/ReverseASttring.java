package STRINGS;

public class ReverseASttring {
    public static void main(String[] args) {
        String s = "Hello";

        String reverse = "";

        String ans = s.toLowerCase();

        for (int i = ans.length() - 1; i >= 0 ; i--) {
            reverse = reverse + ans.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}
