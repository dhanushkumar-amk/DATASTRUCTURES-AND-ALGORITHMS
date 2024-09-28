package STRINGS;


public class MaximumNumbberOperationsToMakeOnesToTeEnd {
    public static void main(String[] args) {
        String s = "hello";
reverse(s);
    }

    public  static int maxOperations(String s){
return 0;
    }

public  static  void reverse(String s){
    char i = 0;
    char j = (char) (s.length() - 1);

    while (i < j){
        char temp = i;
        i = j;
        j =  temp;

        i++;
        j--;
    }

    System.out.println(s);
    }

}

