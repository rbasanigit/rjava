import java.lang.*;
import java.util.*;
public class TestLoop
{
    public static void main(String args[]) 
    {
       int duid=39;
       int dpwd=399;
       float balance =3000.00f;
       int uuid,upwd,flag=0,ch,rtch=0;
       Scanner sc=new Scanner(System.in);
       for(int attempt=1;attempt<=3;attempt++)
       {
            System.out.println("Enter UID:");
            uuid=sc.nextInt();
            System.out.println("Enter PID:");
            upwd=sc.nextInt();
            if (duid==uuid&&dpwd==upwd)
            {
                flag=1;
                break;
            }
            else
            {
                    System.out.println("incorrect pin .attempt failed,please try again ");
                    if(attempt==3)
                    {
                        System.out.println("3 attempts failed.your account is blocked for 24hours");            
                    }
           
            }
       }    
           
		if(flag == 1)
		{
				do
				{
					
					System.out.println("1 : Balance check");
					System.out.println("2 : Withdraw");
					System.out.println("3 : Deposit");
					System.out.println("4 : EXIT");
					
					System.out.print("Enter Your Choice : ");
					ch = sc.nextInt();
					
					switch(ch)
					{
						case 1: 
								System.out.println("Curr Balance : "+balance);
								break;
								
						case 2:
								System.out.println("Enter the amount : ");
								int amt = sc.nextInt();
								
								balance = balance - amt;
								
								System.out.println("Ava Bal : "+balance);
								break;
								
						case 3:
						
								System.out.println("Enter the amount : ");
								int amt1 = sc.nextInt();
								
								balance = balance + amt1;
								
								System.out.println("Ava Bal : "+balance);
								break;
								
						case 4: 
								System.exit(0);
								
						default:
								System.out.println("Invalid Choice");
					}
					
					System.out.println("Want to do another transaction 1/0");
					rtch = sc.nextInt();
				}while(rtch==1);
		
				}
				
		}
		
	}
