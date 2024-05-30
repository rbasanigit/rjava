import java.lang.*;
import java.util.*;

class Arithematic
{
    double add(double num1, double num2)
    {
        return num1 + num2;
    }

    double sub(double num1, double num2)
    {
        return num1 - num2;
    }

    double mul(double num1, double num2)
    {
        return num1 * num2;
    }

    double div(double num1, double num2)
    {
        if (num2 == 0)
        {
            System.out.println("Cannot divide !!!!!!");
            return 0;
        }
        return num1 / num2;
    }
}

public class ArithOpera 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        Arithematic op = new Arithematic();

        double sum = op.add(num1, num2);
        double diff = op.sub(num1, num2);
        double pro = op.mul(num1, num2);
        double quo = op.div(num1, num2);    

        System.out.println("Addition:"+sum);
        System.out.println("Subtraction:"+diff);
        System.out.println("Multiplication:"+pro);
        System.out.println("Division:"+quo);
    }    
}
