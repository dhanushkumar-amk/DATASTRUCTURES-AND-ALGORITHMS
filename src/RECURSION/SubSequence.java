package RECURSION;

public class SubSequence {
    public static void main(String[] args) {
        sequence(" ", "abc");
    }
    static  void sequence(String p, String up){
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;
        }
      char ch = up.charAt(0);

        sequence(p + ch, up.substring(1));
        sequence(p, up.substring(1));

    }
}
