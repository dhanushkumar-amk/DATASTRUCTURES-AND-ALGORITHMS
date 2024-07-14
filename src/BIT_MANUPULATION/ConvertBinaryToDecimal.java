package BIT_MANUPULATION;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        String b = "101101";
        System.out.println(binaryToDecimal(b));
    }
    static int binaryToDecimal(String b){
        int result = 0;
        int powerof2 = 1;

        for (int i = b.length()-1; i >= 0 ; i--) {
            if(b.charAt(i) == '1'){
                result += powerof2;
            }
            powerof2  *= 2;
        }
        return result;
    }
}
