package RECURSION;

public class PhoneNumberCombinations {
    public static void main(String[] args) {
        String s = "46";
        String ans = " ";
        combination(s,ans );
    }

    static String[] keypad = {"","","abc", "def", "ghi", "jkl","mno", "pqrs", "tuv","wxyz"};

    static  void combination(String s, String ans){
        // base case
        if(s.length()== 0){
            System.out.print(ans + " " + " \n ");
            return;
        }

        String key= keypad[s.charAt(0) - 48];
        for (int i = 0; i < key.length() ; i++) {
            combination(s.substring(1), ans + key.charAt(i));
        }
    }
}
