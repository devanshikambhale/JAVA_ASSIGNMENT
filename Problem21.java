// 1. Create a class called UsernameValidator.
// Accept a username from the user.
// Remove leading and trailing spaces.
//  Convert the username to lowercase.
//  Display the cleaned username.
import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Clean username
        username = username.trim();        // remove leading & trailing spaces
        username = username.toLowerCase(); // convert to lowercase

        // Display cleaned username
        System.out.println("Cleaned Username: " + username);

        sc.close();
    }
}