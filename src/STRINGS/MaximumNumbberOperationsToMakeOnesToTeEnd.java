package STRINGS;


public class MaximumNumbberOperationsToMakeOnesToTeEnd {
    public static void main(String[] args) {
reverse("Hello");
    }

    public  static int maxOperations(String s){
return 0;
    }

public  static  void reverse(String s){
    int i = 0;
    int j =  s.length() - 1;

    while (i <= j){
        int temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        i++;
        j--;
    }

    System.out.println(s);
    }

}

