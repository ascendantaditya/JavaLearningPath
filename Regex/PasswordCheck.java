import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean isStrong = password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[a-z]").matcher(password).find() &&
                Pattern.compile("[0-9]").matcher(password).find() &&
                Pattern.compile("[!@#$%^&*()]").matcher(password).find();
        System.out.println(isStrong ? "Strong" : "Weak");
        sc.close();
    }
}