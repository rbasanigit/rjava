import java.lang.*;
import java.util.*;
class AccDet
{
    String ano, aname, atype;
    float blc;
    AccDet()
    {
        blc = 3000.00f;
    }

    void readDet()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account no:");
        ano = sc.nextLine();
        System.out.print("Enter account name:");
        aname = sc.nextLine();
        System.out.print("Enter account type:");
        atype = sc.nextLine();
    }

    void printDet()
    {
        System.out.println("-----ACCOUNT DETAILS-----");
        System.out.println("Account no:"+ano);
        System.out.println("Account name:"+aname);
        System.out.println("Account type:"+atype);
    }

    void withdraw()
    {
        float amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        amt = sc.nextFloat();
        blc = blc - amt;
        System.out.print("Current balance:"+blc);
    }

    void deposit()
    {
        float amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        amt = sc.nextFloat();
        blc = blc + amt;
        System.out.print("Current balance:"+blc);
    }
}
public class Account
{
    public static void main(String a[])
    {
        AccDet a1 = new AccDet();
        a1.readDet();
        a1.printDet();
        int choice;
        int rch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice(1/2/3):");
        System.out.println("1.Withdraw.");  
        System.out.println("2.Deposit.");
        System.out.println("3.Exit."); 
        choice = sc.nextInt(); 
        do
        {
            switch(choice)
            {
                case 1:a1.withdraw();
                break;
                case 2:a1.deposit();
                break;
                case 3:System.exit(1);
                default:System.out.println("Invalid choice !!!!!");
            }
            System.out.print("Do you want to continue?(Enter 1/0):");
            rch = sc.nextInt();
        }while (rch == 1);
    }
}