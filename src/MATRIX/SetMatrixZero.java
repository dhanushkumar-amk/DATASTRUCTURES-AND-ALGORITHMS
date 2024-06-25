package MATRIX;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][] a = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        };

        


    }
        public void setZeroes(int[][] a{
            int n=a[0].length, m=a.length;
            int row[]=new int[m];
            int col[]=new int[n];
            int i,j;
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i][j]==0)
                    {
                        row[i]=-1;
                        col[j]=-1;
                    }
                }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(row[i]==-1 || col[j]==-1)
                    {
                        a[i][j]=0;
                    }
                }
            }
        }
}
