package ZZZZZ.Accenture;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }
   static   String reverse(String str){

        int n = str.length();
        char temp;
        int j = n-1;

         for (int i = 0; i <n/2 ; i++) {
           
             temp = str.charAt(i);
             str.charAt(i) = str.charAt(j);
             str.charAt(j) = temp;
             i++;
             j--;
         }

         return  str;
    }
}
