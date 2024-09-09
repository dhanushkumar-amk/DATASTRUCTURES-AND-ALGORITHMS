package RECURSION;

public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3,'A','B','C');
    }
    static  void tower(int n, char src, char aux, char dest){

        // base case
        if( n == 1){
            System.out.println(src + " -> " + dest);
            return;
        }

        // recursive calls
        tower(n-1, src,dest, aux);
        tower(1,src, aux, dest);
        tower(n-1, aux, src, dest);
    }
}
