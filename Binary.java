import java.lang.*;
import java.util.*;

public class Binary 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int mid;
        int begin = 0;
        int end = n - 1;
        
        System.out.println("enter the element to be searched:");
        int ele = sc.nextInt();
        while (begin <= end)
        {
            mid = (begin + end) / 2;
            if (arr[mid] == ele)
            {
                return mid;
            }
            if (arr[mid] > ele)
            {
                end = mid - 1;
            }
            else
            {
                begin = mid + 1;
            }
        }
        return -1;
    }
}
