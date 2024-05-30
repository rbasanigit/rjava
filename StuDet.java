import java.lang.*;
import java.util.*;
public class StuDet
{
    String regno, sname, gen;
    void readDet()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Registration no:");
        regno=sc.nextLine();
        System.out.print("Enter Student name:");
        sname=sc.nextLine();
        System.out.print("Enter Gender:");
        gen=sc.nextLine();
    }
    void printDet()
    {
        System.out.println("-----STUDENT DETAILS-----");
        System.out.println("Registration no:"+regno);
        System.out.println("Student name:"+sname);
        System.out.println("Gender:"+gen);
    }
    public static void main(String a[])
    {
        StuDet s1=new StuDet();
        s1.readDet();
        s1.printDet();
    }
}
