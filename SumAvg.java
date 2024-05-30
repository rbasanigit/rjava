import java.lang.*;
import java.util.*;

public class SumAvg
{
    public static void main(String a[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter number "+i);
            int n;
            n = sc.nextInt();
            sum = sum + n;
        }
        float avg;
        avg = (float) sum / 5;

        System.out.println("Sum is:"+sum);
        System.out.println("Average is:"+avg);
    }
}
