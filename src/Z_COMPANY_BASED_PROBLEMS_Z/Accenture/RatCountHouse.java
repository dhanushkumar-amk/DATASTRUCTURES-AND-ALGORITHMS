package Z_COMPANY_BASED_PROBLEMS_Z.Accenture;

public class RatCountHouse {
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int n = 8;
        int[] arr = {2,8,3,5,7,4,1,2};
        System.out.println(houseCount(r, unit,n,arr));
    }
    static  int houseCount(int r, int unit, int n, int[] arr){

        // base case
        if(n == 0) return -1;

        int foodRequired = r * unit;
        int count = 0;
        int sum = 0;

        for (int i = 0; i <n; i++) {
            sum += arr[i];
            count++;
            if(sum >= foodRequired) return  count;
        }
        return  0;
    }

}
