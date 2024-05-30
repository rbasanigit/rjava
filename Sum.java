import java.lang.*;
import java.util.*;
public class Sum
{
    public static void main(String a[])
    {
        int n1, n2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 = sc.nextInt();
        System.out.println("Enter n2:");
        n2 = sc.nextInt();
        res = n1+n2;
        System.out.println("Sum is:"+res);
    }
}