import java.util.*;
import java.lang.*;

class ArithmeticChar {
    int add(char c1, char c2) {
        return c1 + c2;
    }

    int sub(char c1, char c2) {
        return c1 - c2;
    }

    int mul(char c1, char c2) {
        return c1 * c2;
    }

    double div(char c1, char c2) {
        if (c2 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) c1 / c2;
    }
}

public class CharOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first character: ");
        char char1 = sc.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char char2 = sc.next().charAt(0);

        ArithmeticChar ch = new ArithmeticChar();

        int sum = ch.add(char1, char2);
        int diff = ch.sub(char1, char2);
        int pro = ch.mul(char1, char2);
        double quo = ch.div(char1, char2);

        System.out.println("Addition (as integers): " + sum);
        System.out.println("Subtraction (as integers): " + diff);
        System.out.println("Multiplication (as integers): " + pro);
        System.out.println("Division (as double): " + quo);
    }
}
