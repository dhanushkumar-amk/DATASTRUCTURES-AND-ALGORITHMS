import java.util.ArrayList;
import java.util.List;

public class FindCommonElementInThreeSortedArray {
    public static List<Integer>
    commonElements(int[] a, int[] b, int[] c)
    {
        //  init three pointers
        int i = 0;
        int j = 0;
        int k = 0;
        
        ArrayList<Integer> common = new ArrayList<>();
        
        while(i < a.length && j < b.length && k < c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                common.add(a[i]);
                i++;
                j++;
                k++;
                
                while(i<a.length && a[i] == a[i - 1]) i++;
                while(j<b.length && b[j] == b[j - 1]) j++;
                while(k<c.length && c[k] == c[k - 1]) k++;
            }
            else if(a[i] < b[j]) i++;
            else if(b[j] < c[k]) j++;
            else k++;
        }
        return common;
    }

 
    public static void main(String[] args)
    {
    
        int[] a = { 1, 5, 10, 20, 30 };
        int[] b = { 5, 13, 15, 20 };
        int[] c = { 5, 20 };

        List<Integer> common = commonElements(a,b,c);

        System.out.print("Common Elements: ");
        for (int ele : common) {
            System.out.print(ele + " ");
        }
    }
}
