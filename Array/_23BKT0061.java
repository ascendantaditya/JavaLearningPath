import java.util.Scanner;

public class _23BKT0061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int espresso = 100;
        int americano = 100;
        int latte = 100;

        int days = 2;

        for (int day = 1; day <= days; day++) {
            System.out.println("Day " + day + ":");
            System.out.print("Enter number of Espresso Bags Sold: ");
            int espressoSold = sc.nextInt();
            System.out.print("Enter number of Americano Bags Sold: ");
            int americanoSold = sc.nextInt();
            System.out.print("Enter number of Latte Bags Sold: ");
            int latteSold = sc.nextInt();

            // Update inventory
            espresso -= espressoSold;
            americano -=port  americanoSold;
            latte -= latteSold;

            // Calculate total inventory
            int totalInventory = espresso + americano + latte;
            System.out.println("Total inventory at the end of day " + day + ": " + totalInventory + " bags\n");
        }

        sc.close();
    }
}