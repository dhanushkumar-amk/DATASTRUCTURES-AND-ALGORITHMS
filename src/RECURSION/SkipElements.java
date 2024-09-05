package RECURSION;

public class SkipElements {
    public static void main(String[] args) {
        String p = " ";
        String up = "bccdaa";
        skip(p,up);
    }
    static  void skip(String p, String up){

        // base case
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a')
            skip(p, up.substring(1));
        else
            skip(p + ch, up.substring(1));
    }
}
