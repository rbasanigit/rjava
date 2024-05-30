import java.lang.*;
import java.util.*;

public class LeapYear
{
    public static void main(String a[])
    {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0))
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }   
}
