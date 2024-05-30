import java.lang.*;
import java.util.*;

public class CopyArr 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
        }

        int arr[] = new int[num.length];

        for (int i = 0; i < n; i++)
        {
            arr[i] = num[i];
        }

        System.out.println("destination array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
