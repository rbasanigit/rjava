import java.lang.*;
import java.util.*;

class Box
{
    double width;
    double height;
    double depth;
}
public class BoxDemo
{
    public static void main(String a[])
    {
        Box b1=new Box();
        double volume;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width:");
        double w=sc.nextDouble();
        System.out.println("Enter height:");
        double h=sc.nextDouble();
        System.out.println("Enter depth:");
        double d=sc.nextDouble();
        b1.width=w;
        b1.height=h;
        b1.depth=d;

        volume=b1.width*b1.height*b1.depth;
        System.out.println("Volume: "+volume);
    }
}
