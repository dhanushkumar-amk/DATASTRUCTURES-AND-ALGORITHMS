package ZZZZZ.Accenture;

public class StringAndNumberBitManupulation {
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        System.out.println(Manipulation(s));
    }
    static  int Manipulation(String s){
        int n = s.length();
        int ans  =  s.charAt(0)-48;

        for (int i = 1; i <n; i=i+2){
            if(s.charAt(i) == 'A')
                ans = ans & s.charAt(i+1);
            else if (s.charAt(i) == 'B')
                ans = ans | s.charAt(i+1);
            else
                ans = ans ^ s.charAt(i+1);
        }
        return  ans;
    }
}
