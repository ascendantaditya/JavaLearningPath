package Variables;

// Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
import java.util.Scanner;

public class qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // new always be in small letters
        System.out.println("Codeforces Stats");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Codeforces Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Your Codeforces Rank: ");
        String rank = sc.nextLine();

        System.out.print("Enter your Codeforces Rating: ");
        int Rating = sc.nextInt();

        System.out.println("Fetching Details of The User....");
        System.out.println("Will Take 10 Seconds........");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println(".......");
        System.out.println("10");

        System.out.println("Your Codeforces Profile is : ");
        System.out.println("Your Name Is : " + name);
        System.out.println("Username: " + user);
        System.out.println("Codeforces Rank Is: " + rank);
        System.out.println("Codeforces Rating Is: " + Rating);

        sc.close();

    }

}
