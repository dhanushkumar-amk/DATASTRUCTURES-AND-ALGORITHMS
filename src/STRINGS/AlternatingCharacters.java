package STRINGS;

public class AlternatingCharacters {
    public static void main(String[] args) {
        String s = "aabaab";
        System.out.println(delete(s));
    }
    static  int delete(String s){
        int count = 0;

        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
            else
                continue;
        }
        return count;
    }
}
