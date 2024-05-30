import java.util.Scanner;

public class SortNames 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (names[j].compareTo(names[j + 1]) > 0)
                {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in ascending order:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
