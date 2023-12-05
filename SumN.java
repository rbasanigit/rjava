import java.lang.*;
import java.util.*;

public class SumN {
    public static void main(String a[])
    {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        sum=n*(n+1)/2;
        System.out.println("Sum:"+sum);
    }
}
