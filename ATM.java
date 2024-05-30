import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class AtmMach {
    double balance;
    double withdrawAmt;
    double depositAmt;
    List<String> transHist;

    AtmMach() {
        balance = 0;
        transHist = new ArrayList<>();
    }

    double getBal() {
        return balance;
    }

    void setBal(double bal) {
        balance = bal;
    }

    double getWithdraw() {
        return withdrawAmt;
    }

    void setWithdraw(double withdraw) {
        withdrawAmt = withdraw;
    }

    double getDeposit() {
        return depositAmt;
    }

    void setDeposit(double deposit) {
        depositAmt = deposit;
    }

    void addToTransactionHistory(String transaction) {
        transHist.add(transaction);
    }

    void getMinistate() {
        if (transHist.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transHist) {
                System.out.println(transaction);
            }
        }
    }
}

// an interface for ATM operations
interface AtmOper {
    void bal();

    void withdraw(double withdraw);

    void deposit(double deposit);

    void ministate();
}

// implementation of the interface
class AtmImp implements AtmOper {
    // create an object for this class
    AtmMach atm = new AtmMach();
    HashMap<Double, String> ministate = new HashMap<>();

    @Override
    public void bal() {
        System.out.println("Available balance: " + atm.getBal());
    }

    @Override
    public void withdraw(double withdraw) {
        if (withdraw <= atm.getBal()) {
            ministate.put(withdraw, "Amount Withdrawn");
            System.out.println("Collect the money: " + withdraw);
            atm.setBal(atm.getBal() - withdraw);
            bal();
        } else {
            System.out.println("Insufficient Balance!!!!!");
        }
    }

    @Override
    public void deposit(double deposit) {
        ministate.put(deposit, "Amount Deposited");
        System.out.println(deposit + " Deposited successfully.");
        atm.setBal(atm.getBal() + deposit);
        bal();
    }

    @Override
    public void ministate() {
        for (HashMap.Entry<Double, String> m : ministate.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

public class ATM {
    public static void main(String a[]) {
        // create an object of the implementation class
        AtmOper obj = new AtmImp();
        int atmno = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------WELCOME TO ATM MACHINE----------");
        System.out.println("Enter ATM number:");
        int atmnum = sc.nextInt();
        System.out.println("Enter PIN number:");
        int pin = sc.nextInt();

        if ((atmnum == atmno) && (atmpin == pin)) {
            System.out.println("Correct Credentials.");
            while (true) {
                System.out.println("Enter your choice:");
                System.out.println("1.View Balance");
                System.out.println("2.Deposit Amount");
                System.out.println("3.Withdraw Amount");
                System.out.println("4.View Ministatement");
                System.out.println("5.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj.bal();
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit:");
                        double deposit = sc.nextDouble();
                        obj.deposit(deposit);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw:");
                        double withdraw = sc.nextDouble();
                        obj.withdraw(withdraw);
                        break;
                    case 4:
                        obj.ministate();
                        break;
                    case 5:
                        System.out.println("Please collect your card.");
                        System.exit(0);
                    default:
                        System.out.println("Enter correct choice!!!!!!");
                }
            }
        } else {
            System.out.println("Invalid Credentials!!!!");
            System.exit(0);
        }
    }
}
