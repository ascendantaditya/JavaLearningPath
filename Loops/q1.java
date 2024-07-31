package Loops;

import java.util.*;

// print the sum of first n natural numbers
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;

        for (int i = 1; i <= n; i++) {
            Sum = Sum + i;
        }

        System.out.println(Sum);
        sc.close();
    }
}