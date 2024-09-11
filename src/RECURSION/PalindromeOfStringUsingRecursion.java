package RECURSION;

public class PalindromeOfStringUsingRecursion {
    public static void main(String[] args) {
        String s = "maddam";
        boolean ans = isPalindrome(s,0, s.length()-1);

        if ( ans == true)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is  not a palindrome");
    }
    static boolean isPalindrome(String s, int i,int j){

        // base case
        if (s.charAt(i) != s.charAt(j))
            return  false;
        if(j <= i)
            return true;

        return  isPalindrome(s, i+1, j - 1);
    }

}
