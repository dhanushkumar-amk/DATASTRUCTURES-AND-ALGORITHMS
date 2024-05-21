package STRINGS;

import  java.lang.*;


public class palindrome {
    public static void main(String[] args) {
       String s = "racecar" ;
        System.out.println(Palindrome(s));
    }
    static boolean Palindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                right--;
                left++;
            }
            else return false;
        }

        return true;
    }
}
