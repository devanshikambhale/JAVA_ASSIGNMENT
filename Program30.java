// Create a class PasswordMaskingSystem.
//  Accept password from the user.
//  Replace all characters except last two using replace()
// method.
//  Display masked password.
import java.util.Scanner;

class PasswordMaskingSystem {

    // Method to mask password
    public String maskPassword(String password) {
        if (password.length() <= 2) {
            return password; // No masking needed
        }

        String maskedPart = password.substring(0, password.length() - 2)
                                   .replaceAll(".", "*");
        String visiblePart = password.substring(password.length() - 2);

        return maskedPart + visiblePart;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept password from user
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        PasswordMaskingSystem pms = new PasswordMaskingSystem();

        // Display masked password
        String masked = pms.maskPassword(password);
        System.out.println("Masked Password: " + masked);

        sc.close();
    }
}