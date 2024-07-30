package Conditional_Statements;

import java.util.*;

public class switch_case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Operator(/,*,+,-): ");
        char Operator = sc.next().charAt(0);

        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        switch (Operator) {
            case '+': // remember to put the operators always in the upper coloumn thing
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }

}
