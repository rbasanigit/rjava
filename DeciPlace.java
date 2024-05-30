import java.lang.*;
import java.util.*;

public class DeciPlace
{
    public static void main(String a[])
    {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
        int newn1 = (int) (num1*1000);
        int newn2 = (int) (num2*1000);
        if(newn1 == newn2)
        {
            System.out.println("Numbers are same upto 3 decimal places");
        }
        else
        {
            System.out.println("Numbers are different");
        }
    }
}

