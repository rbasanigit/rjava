import java.util.Scanner;

class BookDet 
{
    int bcode;
    String btitle;
    double bprice;

    BookDet(int bcode, String btitle, double bprice) 
    {
        this.bcode = bcode;
        this.btitle = btitle;
        this.bprice = bprice;
    }

    BookDet() 
    {
    }

    void readDet() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book code:");
        this.bcode = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter book title:");
        this.btitle = sc.nextLine();

        System.out.println("Enter book price:");
        this.bprice = sc.nextDouble();
    }

    void printDet() 
    {
        System.out.println("---------- BOOK DETAILS ---------");
        System.out.println("Book code: " + bcode);
        System.out.println("Book title: " + btitle);
        System.out.println("Book price: " + bprice);
    }
}

public class Book 
{
    public static void main(String[] args) 
    {
        BookDet b1 = new BookDet(); 
        b1.readDet();
        b1.printDet();
    }
}
