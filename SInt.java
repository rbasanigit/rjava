import java.lang.*;
import java.util.*;

public class SInt {
    public static void main(String a[])
    {
        int p,t,r,I;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        p=sc.nextInt();
        System.out.println("Enter the time:");
        t=sc.nextInt();
        System.out.println("Enter the rate:");
        r=sc.nextInt();
        I=(p*t*r)/100;
        System.out.println("Simple Interest:"+I);

    }
}