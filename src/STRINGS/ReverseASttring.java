package STRINGS;

public class ReverseASttring {
    public static void main(String[] args) {
    String s = "hello";


        String reverse = "";

        s = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0 ; i--) {

            reverse = reverse + i;
            System.out.println(s);
            }


    }

}
