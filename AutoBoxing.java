import java.lang.*;
import java.util.*;

public class AutoBoxing 
{
    public static void main(String a[])
    {
        int x=70;
        Integer i=Integer.valueOf(x); //converting primitive(int) to wrapper(Integer)
        Integer j=x;
        System.out.println(x+" "+i+" "+j);
    }    
}
