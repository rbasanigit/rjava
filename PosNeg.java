import java.lang.*;
import java.util.*;

public class PosNeg
{
    public static void main(String a[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        if (n > 0)
        {
            System.out.println("positive number");
        }
        else if (n < 0) 
        {
            System.out.println("negative number");
        }
        else
        {
            System.out.println("either positive or negative number");
        }
    }
}
