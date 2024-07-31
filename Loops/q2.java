package Loops;

import java.util.*;
//Print a multiplication table and take input from the user

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }

        sc.close();

    }

}
