package SEARCHING.LINERARSEARCH;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,46,7,6};
        int target = 46;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == target) {
                System.out.println("The value Avalible iin the index of : " + i);
            } else {
                System.out.println("The value is not avaliable");
            }
        }
    }
}
