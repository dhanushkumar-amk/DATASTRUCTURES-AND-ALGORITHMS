package ZZZZZ.Accenture;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
