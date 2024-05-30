import java.lang.*;
import java.util.*;
public class QuadEqu
{
    public static void main(String a[])
    {
        int x, y, z, eq;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of x:");
        x = sc.nextInt();
        System.out.println("Enter coefficient of y:");
        y = sc.nextInt();
        System.out.println("Enter coefficient of z:");
        z = sc.nextInt();

        eq = y * y - 4 * x * z;

        if (eq > 0)
        {
            double root1 = (-y + Math.sqrt(eq)) / (2 * x);
            double root2 = (-y - Math.sqrt(eq)) / (2 * x);
            System.out.println("Roots are:"+root1+"and"+root2);
        }
        else if (eq == 0)
        {
            double root = -y / 2 * x;
            System.out.println("Root is:"+root);
        }
        else
        {
            System.out.println("Roots are complex and different");
        }
    }
}