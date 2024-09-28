package STRINGS;

public class ReverseASttring {
    public static void main(String[] args) {
    String s = "Hello";


        String reverse = "";

        s = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0 ; i--) {

            reverse = reverse + s.charAt(i);
            System.out.println(s);
            }


    }

}
