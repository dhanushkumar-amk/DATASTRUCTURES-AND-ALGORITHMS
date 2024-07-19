class CountOccuranceOfAnelement {
    static int countOccurrences(int arr[], int n, int target){
        int result = 0;
        for(int i = 0; i<n;i++){
            if(target == arr[i])
            result++;
        }
        return result;
    }
    
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,2,2,4,5,6,7};
        int n = 11;
        int target = 2;
        System.out.println( countOccurrences(arr,n,target));
    }
}
