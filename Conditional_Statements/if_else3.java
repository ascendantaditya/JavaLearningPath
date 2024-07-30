package Conditional_Statements;

import java.util.*;

public class if_else3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Button: ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");

        } else if (button == 2) {
            System.out.println("Namaste");

        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }

}
