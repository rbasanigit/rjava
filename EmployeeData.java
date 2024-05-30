import java.lang.*;
import java.util.*;

public class EmployeeData {
    String eid,ename,eno,cname;
    double basic,hra,net;

    EmployeeData(String eid, String ename, String eno, String cname,
                    double basic, double hra) {
        this.eid = eid;
        this.ename = ename;
        this.eno = eno;
        this.cname = cname;
        this.basic = basic;
        this.hra = hra;
        this.net = basic + hra;
    }

    void showData() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Phone Number: " + eno);
        System.out.println("Company Name: " + cname);
    }

    void showData(double petrol) {
        showData(); 
        double totalSalary = net + petrol;
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("Net Salary: " + net);
        System.out.println("Petrol Allowance: " + petrol);
        System.out.println("Total Salary (with petrol allowance): " + totalSalary);
    }

    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee Id:");
        String eid=sc.nextLine();
        System.out.println("Enter employee name:");
        String ename=sc.nextLine();
        System.out.println("Enter phone number:");
        String eno=sc.nextLine();
        System.out.println("Enter company name:");
        String cname=sc.nextLine();
        System.out.println("Enter basic salary:");
        double basic=sc.nextDouble();
        System.out.println("Enter hra:");
        double hra=sc.nextDouble();

        EmployeeData e1 = new EmployeeData(eid,ename,eno,cname,basic,hra);

        System.out.println("---------- EMPLOYEE DETAILS ----------");
        e1.showData();

        System.out.println("\nPay Slip with Petrol Allowance:");
        System.out.println("Enter petrol allowance:");
        double petrol=sc.nextDouble();
        e1.showData(petrol);
    }
}
