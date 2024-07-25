import java.util.Scanner;

public class CountParenthis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int c = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                c++;
            } else if (ch == ')' && c > 0) {
                c--;
            }
        }
        System.out.println(c > 0 ? 1 : 0);
    }
}
