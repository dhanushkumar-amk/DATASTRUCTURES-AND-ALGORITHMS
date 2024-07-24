
/*
You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales

*/




import java.util.*;

class ReplaceCharacter{
public static void replaceChar (String str, char ch1, char ch2) 
    {
    String res = "";
   for(int i =0; i < str.length(); i++){
       if(str.charAt(i) == ch1) res += ch2;
       else if(str.charAt(i) == ch2) res += ch1;
       else res += str.charAt(i);
   }
   System.out.println(res);
    }
    
    
public static void main (String[]args)
 {
    Scanner sc = new Scanner (System.in);
    String str = sc.next ();
    char ch1 = sc.next ().charAt (0);
    char ch2 = sc.next ().charAt (0);
    
    replaceChar (str, ch1, ch2);
  }
}
