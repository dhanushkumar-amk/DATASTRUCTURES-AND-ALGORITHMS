package ZZZZZ.Accenture;

import java.util.HashMap;

class IsoGram {
    public static void main(String[] args) {
        String s = "machine";
        System.out.println(isGram(s));
    }

    static boolean isGram(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Update the frequency count for the character in the map
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            // If the character count is greater than 1, it's not an isogram
            if (map.get(currentChar) > 1) {
                return false;
            }
        }

        // If no character has a count greater than 1, it's an isogram
        return true;
    }
}
