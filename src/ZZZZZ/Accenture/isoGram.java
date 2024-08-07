package ZZZZZ.Accenture;

import java.util.HashMap;

public class isoGram {
    public static void main(String[] args) {
        String s = "machine";
        System.out.println(isGram(s));
    }
    static  boolean isGram(String s){
        HashMap<Character, Integer>  map = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            char count = map.getOrDefault(s.charAt(i), 0);
            count[i]++;
            
            if(map[s[i]] > 1) return  false;
        }
        return  true;
    }
}
