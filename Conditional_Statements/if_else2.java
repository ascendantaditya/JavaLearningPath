package Conditional_Statements;

import java.util.*;

public class if_else2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal to b");

        } else if (a >= b) {
            System.out.println("a is greater than b");

        } else if (a <= b) {
            System.out.println("a is lesser than b");

        } else {
            System.out.println("Invalid Input");
        }

        sc.close();

    }

}
