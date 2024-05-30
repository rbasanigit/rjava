import java.lang.*;
import java.util.*;

public class TrianglePattern 
{
    public static void main(String a[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Right angled triangle pattern:");
        for (int i = 1; i <= row; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}

