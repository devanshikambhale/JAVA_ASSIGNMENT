// Design a program EmailChecker.
//  Accept an email address from the user.
//  Check whether the email contains &quot;@gmail.com&quot;.
//  Display &quot;Valid Gmail Address&quot; or &quot;Invalid Email&quot
import java.util.Scanner;

class EmailChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept email from user
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        // Check if email contains "@gmail.com"
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}