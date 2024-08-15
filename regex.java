
// A man a plan a canal Panama
import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(input.equals(new StringBuilder(input).reverse().toString()));
        sc.close();
    }
}