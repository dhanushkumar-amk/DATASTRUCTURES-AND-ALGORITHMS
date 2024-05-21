package STRINGS;

import java.util.HashMap;

public class FirstUniqueCharcterInAString {
    public static void main(String[] args) {
  String s = "FourByFourFrog";
        System.out.println(FirstUnique(s));
    }

    public static int FirstUnique(String s){

        s  = s.toLowerCase();
        int index =-1;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {

            char c = s.charAt(i);
            int freq = hm.getOrDefault(c, 0);
            hm.put(c, (freq + 1));
        }
        for (int i = 0; i <s.length() ; i++) {
            if (hm.get(s.charAt(i)) == 1)
            {
                index = i;
                break;
            }
        }
        return index;
    }

}
