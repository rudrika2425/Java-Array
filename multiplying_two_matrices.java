public class multiplying_two_matrices {
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int [3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                for(int k=0;k<3;k++)
                {
                  c[i][j]=c[i][j]+a[i][j]*b[i][j];
                }
            }
        }    
            
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                  System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            
            
        }
    }
    

