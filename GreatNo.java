import java.lang.*;
import java.util.*;

public class GreatNo 
{
    public static void main(String a[])
    {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        System.out.println("Enter third number:");
        n3 = sc.nextInt();
        if (n1 >= n2 && n1 >= n3)
        {
            System.out.println("Greatest number is:"+n1);
        }
        else if (n2 >= n1 && n2 >= n3)
        {
            System.out.println("Greatest number is:"+n2);
        }
        else
        {
            System.out.println("Greatest number is:"+n3);
        }
    }   
}
