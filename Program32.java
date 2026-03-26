// Online Division Calculator
// Create a class DivisionCalculator. Accept two integers from
// user. Perform division operation. Handle division by zero using
// try-catch.
// Output: If valid: &#39;Result: &lt;value&gt;&#39; Else: &#39;Cannot divide by zero&#39;
import java.util.Scanner;

class DivisionCalculator {

    // Method to perform division
    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two integers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        DivisionCalculator dc = new DivisionCalculator();

        // Perform division
        dc.divide(num1, num2);

        sc.close();
    }
}