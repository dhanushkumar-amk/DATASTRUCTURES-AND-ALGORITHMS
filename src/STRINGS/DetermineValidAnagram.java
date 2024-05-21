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
    }
}
