import java.lang.*;
import java.util.*;
public class UidPass
{
    public static void main(String a[])
    {
        int userid=123;
        int password=555;
        int uid,pwd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter uid:");
        uid=sc.nextInt();
        System.out.println("Enter pwd:");
        pwd=sc.nextInt();
        if(userid==uid && password==pwd) 
        {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong userid and password");
        }
    }
}
