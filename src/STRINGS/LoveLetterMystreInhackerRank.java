package STRINGS;

public class LoveLetterMystreInhackerRank {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(loveLetter(s));
    }
    static  int loveLetter(String s){
        int count = 0;
        int char1 = ' ';
        int char2 = ' ';
        int temp = 0;

        int i = 0;
        int j = s.length()-1;

        while(i < j){
            char1 = s.charAt(i);
            char2 = s.charAt(j);

            if(char1 > char2)
                temp = char1 - char2;
            else
                temp = char2 - char1;

            // store whatever the value int temp is store in the count
            count += temp;

            i++;
            j--;
        }

        return  count;
    }
}
