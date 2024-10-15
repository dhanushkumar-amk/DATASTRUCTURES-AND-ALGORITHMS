package MATHEMATICALS;

public class GradingStudent {
    public static void main(String[] args) {
        int[] grades = {20,44,67,56,56};
        gradeStu(grades);
    }

    public  static  void gradeStu(int[] grade){

        for (int i = 0; i < grade.length ; i++) {

            if (grade[i]  < 38)
                continue;
            else{
                int multiple = (grade[i]/5 + 1) * 5;
                if (multiple - grade[i] < 3)
                    grade[i] = multiple;
            }
        }


        for (int i = 0; i < grade.length ; i++) {
            System.out.println(grade[i] + " ");
        }

    }
}
