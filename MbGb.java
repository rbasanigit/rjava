import java.lang.*;
import java.util.*;

public class MbGb {
    public static void main(String a[])
    {
        float mb,gb;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter MB:");
        mb=sc.nextFloat();
        gb=mb/1000;
        System.out.println("In GB:"+gb);
    }
}
