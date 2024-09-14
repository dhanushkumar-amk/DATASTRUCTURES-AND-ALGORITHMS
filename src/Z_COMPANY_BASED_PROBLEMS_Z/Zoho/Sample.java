package Z_COMPANY_BASED_PROBLEMS_Z.Zoho;

public class Sample {
    public static void main(String[] args) {
        int m1 = 100;
        int m2 = 100;
        int m3 = 100;
        int m4 = 100;
        int m5 = 100;
        average(m1,m2,m3, m4, m5);
    }
    static  void average(int m1, int m2, int m3, int m4, int m5){
        int total = 0;
        float avg = 0;

        total = m1 + m2 + m3 + m4 + m5;
        avg = total / 5;
        if(avg > 70)
            System.out.println("eligible");
        else
            System.out.println("not eligible");
    }
}
