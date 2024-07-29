package Variables;

import java.util.Scanner;

//Make a program that takes the radius of a circle as input, calculates its perimeter and area and prints it as output to the user.

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of The Cirle : ");
        int radius = sc.nextInt();
        float pi = (float) 3.14;// float using hardcoded
        float area = pi * radius * radius;
        float perimeter = 2 * pi * radius;
        System.out.println("The Area of the Circle is : " + area);
        System.out.println("The Perimeter of Circle is : " + perimeter);

        sc.close();

    }

}
