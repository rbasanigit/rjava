import java.lang.*;
import java.util.*;
public class AriOper
{
    public static void main(String a[])
    {
        int n1,n2,res;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1:");
        n1=sc.nextInt();
        System.out.println("Enter n2:");
        n2=sc.nextInt();
        System.out.println("Enter the character (a,s,m,d) (q to exit):");
        op=sc.next().charAt(0);
        switch(op)
        {
            case 'a':res=n1+n2;
            System.out.println("Addition:"+res);
            break;
            case 's':res=n1-n2;
            System.out.println("Subtraction:"+res);
            break;
            case 'm':res=n1*n2;
            System.out.println("Multiplication:"+res);
            break;
            case 'd':res=n1/n2;
            System.out.println("Division:"+res);
            break;
            case 'q':break;
            default:System.out.println("Wrong operation!!!!");
        }

    }
}

