import java.lang.*;
import java.util.*;

public class UnBoxing 
{
    public static void main(String a[])
    {
        Integer x=new Integer(9);
        int i=x.intValue(); //converting wrapper(Integer) to primitive(int)
        int j=x;
        System.out.println(a+" "+i+" "+j);
    }    
}
