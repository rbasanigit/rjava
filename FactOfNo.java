import java.lang.*;
import java.util.*;
class Fact
{
    int res,num;
    Fact()
    {
        res=1;
    }
    int findFact(int x)
    {
        num=x;
        int temp;
        for(int i=1;i<=num;i++)
        {
            res=res*i;
        }
        return res;
    }
}
public class FactOfNo
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        Fact f=new Fact();
        int out=f.findFact(n);
        System.out.println(out);
    }
}
