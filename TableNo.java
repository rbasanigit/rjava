import java.util.Scanner;

public class TableNo {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Table for " + n + ":");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

