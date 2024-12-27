
class GreatestEvenValueInArray {
    public static void main(String[] args) {
     int[] arr = {22,33,44,55,66,77,88,99};
      System.out.println("max even value " + evenGreatest(arr));
    }
    
static int evenGreatest(int[] arr){
    
    int max = arr[0];
    
    for(int i = 0; i < arr.length; i ++){
        if(arr[i] % 2 == 0){
            if(arr[i] > max)
                max = arr[i];
        }
    }
    return max;
    }
}
