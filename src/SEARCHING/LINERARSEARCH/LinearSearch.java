package SEARCHING.LINERARSEARCH;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,46,7,6};
        int target = 46;

        for (int i = 0; i <arr.length ; i++) {
            while(arr[i] == target) {
                System.out.println("The value Avalible in the index of : " + i);
            }
                System.out.println("The value is not avaliable");
           
        }
    }
}
