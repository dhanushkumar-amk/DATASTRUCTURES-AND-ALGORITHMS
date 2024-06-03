package ARRAYS;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] a = {45, 56, 34, 78, 56, 99, 101};
        System.out.println(SecondLargest(a));
    }

    static int SecondLargest(int[] a) {
        int n = a.length;
//        assign the max1 and max2
        int max1 = 0;
        int max2 = 0;

//        check the  first two values in array and store into max1 and max2
        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];

        } else {
            max1 = a[1];
            max2 = a[0];
        }
// start the for  loop with third element of an array  to end
        for (int i = 2; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        return max2;
    }


}

