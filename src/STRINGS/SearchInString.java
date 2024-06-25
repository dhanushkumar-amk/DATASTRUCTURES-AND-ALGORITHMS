package STRINGS;

public class SearchInString {
    public static void main(String[] args) {
     String name = "Dhanush";
     char target = 'u';
        System.out.println(search2(name,target));
    }

    // one way using for loop
    static boolean search(String name, char target){
        if(name.length() == 0) return  false;
        for (int i = 0; i <name.length() ; i++) {
            if(target == name.charAt(i)) return true;
        }
        return false;
    }

    // another way using forEach loop
    static boolean search2(String name, char target){
        if(name.length() == 0) return  false;

        // using for each loop
        // first change he given string into array  using toCharArray() method

        for(char ch : name.toCharArray())
            if(ch == target) return true;
        return false;
    }
}
