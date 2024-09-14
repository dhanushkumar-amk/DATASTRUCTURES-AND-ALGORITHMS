package ZZZZZ.Accenture;

public class CountingValleys {
    public static void main(String[] args) {
        String s = "DUDDDUDUUUU";
        System.out.println(countValley(s));
    }
    public  static  int countValley(String s){
        s = s.toLowerCase();
        int count = 0;
        int height = 0;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == 'u'){
               height++;

               if(height == 0) count++;
            }
            else height--;
        }
        return  count;
    }
}
