package Conditional_Statements;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You're eligible to Marriage");
        } else {
            System.out.println("You're not eligible to do Marriage");
        }

        sc.close();

    }

}
