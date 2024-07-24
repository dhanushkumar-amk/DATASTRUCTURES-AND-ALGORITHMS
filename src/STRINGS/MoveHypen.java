
/*
char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”


*/


class MoveHypen{
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
