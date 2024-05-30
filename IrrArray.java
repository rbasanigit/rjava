import java.lang.*;
import java.util.*;

public class IrrArray 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of rows:");
        int n = sc.nextInt();

        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++)
        {
            System.out.println("enter the no.of columns for row" +(i + 1)+ ":");
            int m = sc.nextInt();
            arr[i] = new int[m];
            System.out.println("enter the elements for row" +(i + 1)+ ":");
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("irregular array is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j]+ "");
            }
            System.out.println();
        }
    }    
}
