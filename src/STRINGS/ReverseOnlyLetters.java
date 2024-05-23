package STRINGS;
import java.lang.*;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "olleh dlrow!";
        System.out.println(ReverseCharcter(s));
    }
    static String ReverseCharcter(String s){
        char[] arr = s.toCharArray();
            int left =0;
            int right = arr.length;

    while (left < right){
        if(!Character.isLetter(arr[left])) left++;
        else if(!Character.isLetter(arr[right])) right++;
        else {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
        return new String(arr);
    }
}
