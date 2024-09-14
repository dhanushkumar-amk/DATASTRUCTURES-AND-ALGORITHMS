package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class Movehyphen {
    public static void main(String args[]){
        String s = "hari-sudhan";
        int n = s.length();
        System.out.println(hypen(s, n));
    }
    public static String hypen(String s, int n){
        String res = "";
        for(int i=0; i< n; i++){
            if(s.charAt(i) == '-') res = s.charAt(i) + res;
            else res = res + s.charAt(i);
        }
        return res;
    }
}
