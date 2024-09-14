package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class absdifference {
    public static void main(String[] args) {
    int[] arr = {12,3,14,56,77,13};
    int n = 6;
    int num = 13;
    int diff = 2;
        System.out.println(abs(arr, n, num, diff));
    }
    static  int abs(int[] arr, int n, int num, int diff){

        int count = 0;

        for (int i = 0; i <n; i++) {
            if(Math.abs(arr[i]-num) <= diff) count++;
        }

        if(count == 0) return  -1;

        return  count;
    }

}
