import java.lang.*;
import java.util.*;

public class MatMul 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no.of rows of 1st matrix:");
        int r1 = sc.nextInt();
        System.out.println("enter the no.of columns of 1st matrix:");
        int c1 = sc.nextInt();

        int[][] mat1 = new int[r1][c1];
        System.out.println("enter the elements of 1st matrix:");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the no.of rows of 2nd matrix:");
        int r2 = sc.nextInt();
        System.out.println("enter the no.of columns of 2nd matrix:");
        int c2 = sc.nextInt();

        if (c1 != r2) 
        {
            System.out.println("Matrix multiplication is not possible!!!!!");
            sc.close();
            return;
        }

        int[][] mat2 = new int[r2][c2];
        System.out.println("enter the elements of 2nd matrix:");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("matrix multiplication:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
