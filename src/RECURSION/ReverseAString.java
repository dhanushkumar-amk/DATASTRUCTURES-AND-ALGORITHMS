package RECURSION;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s,"", s.length()-1));
    }

    static String reverse(String s, String reverseValue, int index){
        if (index < 0)
            return reverseValue;

        return reverse(s, reverseValue + s.charAt(index), index - 1);
    }
}
