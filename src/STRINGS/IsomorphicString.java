package STRINGS;
import java.lang.*;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
String s ="";
    }
    static boolean Isomorphic(String s , String t){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i);

            if(map1.containsKey(a) && map1.get(a) != b || map2.containsKey(b) && map1.get(b) != a  )
                return  false;

            map1.put(a, b);
            map2.put(b,a);

        }

        return true;
    }
}
