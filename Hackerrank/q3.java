package Hackerrank;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left by nextDouble()
        String s = scan.nextLine(); // Read the entire line for the string

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
        // For Multiline Input in string , you need to add : scan.nextLine before the
        // string component is given .
    }
}