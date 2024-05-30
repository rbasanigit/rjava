import java.lang.*;
import java.util.*;
public class DayWeek
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter a number:");
        int n = rand.nextInt(7) + 1;
        System.out.println(n);
        switch (n)
        {
            case 1:System.out.println("MONDAY");
            break;
            case 2:System.out.println("TUESDAY");
            break;
            case 3:System.out.println("WEDNESDAY");
            break;
            case 4:System.out.println("THURSDAY");
            break;
            case 5:System.out.println("FRIDAY");
            break;
            case 6:System.out.println("SATURDAY");
            break;
            case 7:System.out.println("SUNDAY");
            break;
            default:System.out.println("INVALID DAY !!!!!!!!!!!");
        }
    }
}
