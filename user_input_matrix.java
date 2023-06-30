import java.util.Scanner;

public class user_input_matrix {
    public static void main(String[] args)
    {
            int m;
            int n;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of rows of the matrix: ");
            m = in.nextInt();
            System.out.print("Enter the number of columns of the matrix: ");
            n = in.nextInt();
            int first[][] = new int[m][n];
            System.out.print("Enter the elements of the matrix: ");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    first[i][j] = in.nextInt();
                }
            }
  
            // Display the elements of the matrix
            System.out.println("Elements of the matrix are");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(first[i][j] + "  ");
                }
                System.out.println();
            }
    }
    
}
