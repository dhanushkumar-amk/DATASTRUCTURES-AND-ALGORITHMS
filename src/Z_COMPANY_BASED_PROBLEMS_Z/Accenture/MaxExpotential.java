package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class MaxExpotential {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        System.out.println(exp(a,b));
    }
    static  int count(int i){

      int c = 0;
        while ( i % 2 == 0 && i > 0){
            c++;
            i = i/2;
        }
        return  c;
    }
    static int exp(int a, int b){

        int max = 0;
        int num = 0;



        for (int i = a; i <=b ; i++) {
        int temp = count(i);
        if(temp > max){
            max = temp;
            num = i;
           }
        }
        return  num;
    }


}
