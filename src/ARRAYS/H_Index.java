package ARRAYS;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {3,0,6,5,1};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
    int[] count = new int[citations.length + 1];
    for(int citationCountPaper : citations){
        if (citationCountPaper >= citations.length)
            count[citations.length] += 1;
        else
            count[citationCountPaper] += 1;
      }

        int paperWithAtlestHCitations = 0;
        for(int h = citations.length; h >0; h--){
            paperWithAtlestHCitations += count[h];
            if (paperWithAtlestHCitations >= h)
                return h;
        }
        return 0;
    }
}
