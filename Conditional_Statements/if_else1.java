package Conditional_Statements;

import java.util.*;

public class if_else1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");
        }

    }

}
