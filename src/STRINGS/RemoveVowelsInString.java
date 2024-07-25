
/*
Write a program that will take one string as input. The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string. If there are two or more vowels that occur together then the program shall ignore all of those vowels.

Example 1

Input:  Cat
Output:  Ct
*/


class RemoveVowelsInString {
    public static void main(String[] args) {
      String input = "hello world";
      System.out.println("The output is : " + removeVowels(input));
    }
    public static String removeVowels(String input){
        
        StringBuilder result = new StringBuilder();
        for( char c : input.toCharArray()){
            if(!vowels(c)) result.append(c);
        }
        return result.toString();
    }
    
    public static boolean vowels(char c){
        
        char lowerCase = Character.toLowerCase(c);
        
        return lowerCase == 'a' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'e' || lowerCase == 'u';
    }
}
