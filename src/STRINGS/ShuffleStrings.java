package STRINGS;
import  java.lang.*;

public class ShuffleStrings {
    public static void main(String[] args) {
    String s = "rockslife";
    int[] indices = {4,5,6,7,8,0,1,2,3};
        System.out.println(shuffle(s, indices));
    }

    static String shuffle(String s , int[] indices){
char[] str = new char[s.length()];

        for (int i = 0; i <s.length() ; i++) {
            str[indices[i]] = s.charAt(i);
        }
 return  String.valueOf(str);
    }

}
