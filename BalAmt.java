import java.lang.*;
import java.util.*;
public class BalAmt {
    public static void main(String a[])
    {
        int uid=123;
        int pwd=333;
        int user,pass;
        float blc=5000.00f;
        int ch;
        int rch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter userid:");
        user=sc.nextInt();
        System.out.println("Enter password:");
        pass=sc.nextInt();
        if(uid==user && pwd==pass)
        {
            do
            {
                System.out.println("1.Balance.");
                System.out.println("2.Withdraw.");
                System.out.println("3.Deposit.");
                System.out.println("4.Exit.");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:System.out.println("Current balance:"+blc);
                    break;
                    case 2:float amt;
                    System.out.println("Enter amount to withdraw:");
                    amt=sc.nextInt();
                    blc=blc-amt;
                    System.out.println("Available balance:"+blc);
                    break;
                    case 3:System.out.println("Enter amount to deposit:");
                    amt=sc.nextInt();
                    blc=blc+amt;
                    System.out.println("Current balance:"+blc);
                    break;
                    case 4:System.exit(1);
                    default:System.out.println("Invalid choice !!!!!!");
                }
                System.out.println("Do you want to continue?(Enter 1/0):");
                rch=sc.nextInt();
            }while(rch==1);
        }
        else
        {
            System.out.println("Check your credentials!!!!");
        }
    }
}
