package MATHEMATICALS;

public class UtopianTree
{
    public static void main(String[] args) {
        int n = 7;
        int Height = 1;
        System.out.println(treeHeight(n,Height));
    }

    static  int treeHeight(int n, int Height){

        for (int i = 0; i <n ; i++) {

            if(i % 2 == 0)
                Height *= 2;
            else
                Height += 1;
        }
        return Height;
    }

}
