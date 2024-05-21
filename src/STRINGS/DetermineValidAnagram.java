package STRINGS;
import  java.lang.*;

public class DetermineValidAnagram {
    public static void main(String[] args) {
String string1 = "dormitory";
String string2 = "dirty room";

        System.out.println(ValidAnagrams(string1, string2));

    }
    static boolean ValidAnagrams(String string1 , String string2)
    {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        string1 = string1.replace(" ", "");
        string2 = string2.replace(" ", "");

        int[] counts = new int[26];

        for (int i = 0; i < string1.length() ; i++) {
            counts[string1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < string2.length(); i++) {
            counts[string2.charAt(i) - 'a']--;
        }

        for(int count : counts){
            if (count != 0){
                return  false;
            }
        }

     return true;
    }
}
