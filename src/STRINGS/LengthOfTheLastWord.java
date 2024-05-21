package STRINGS;
import java.lang.*;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String word = "Hello World ";
        System.out.println(lastWordCount(word));
    }

    static int lastWordCount(String word){

        int count =0;

        for (int i = word.length()-1; i >= 0 ; i++) {
            if(word.charAt(i) != ' ') count++;

            else {
                if (count > 0) return  count;
            }
        }
        return count;
    }
}
