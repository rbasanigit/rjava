import java.lang.*;
import java.util.*;

class Comp
{
    void compare(int a, int b)
    {
        if (a > b)
        {
            System.out.println(a+" is greatest");
        }
        else if (b > a)
        {
            System.out.println(b+" is greatest");
        }
        else 
        {
            System.out.println("both are equal");
        }
    }

    void compare(char a, char b)
    {
        if (a > b)
        {
            System.out.println(a+" is greatest");
        }
        else if (b > a)
        {
            System.out.println(b+" is greatest");
        }
        else 
        {
            System.out.println("both are equal");
        }
    }    

    void compare(String a, String b) 
    {
        int res = a.compareTo(b);
        if (res > 0) 
        {
            System.out.println(a+" greatest:");
        } 
        else if (res < 0) 
        {
            System.out.println(b+" greatest");
        } 
        else 
        {
            System.out.println("both are equal");
        }
    }
}
public class CompOver 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        Comp cm = new Comp();

        System.out.println("enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number:");
        int n2 = sc.nextInt();

        System.out.println("enter 1st character:");
        char c1 = sc.next().charAt(0);
        System.out.println("enter 2nd number:");
        char c2 = sc.next().charAt(0);

        System.out.println("enter 1st string:");
        String s1 = sc.nextLine();
        System.out.println("enter 2nd string:");
        String s2 = sc.nextLine();

        cm.compare(n1, n2);
        cm.compare(c1, c2);
        cm.compare(s1, s2);
    }    
}
