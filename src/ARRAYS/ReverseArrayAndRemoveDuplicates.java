class ReverseArrayAndRemoveDuplicates {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,4,5,6,7,8,9};
      
      reverse(arr);
      
      int ans = duplicates(arr);
      for(int i = 0; i < ans; i++){
          System.out.print(arr[i] + " ");
      }
    }
    
    static int duplicates(int[] arr){
        
        int j =0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
        
    }
    
    static void reverse(int[] arr){
        
        int start = 0;
        int end = arr.length -1;
        
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
