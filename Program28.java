// Create a class TextProcessingBuilder.
//  Use StringBuilder to create a string.
//  Append additional text.
//  Display modified string.
//  Write a comment comparing StringBuilder and
StringBuffer.
import java.util.Scanner;

class TextProcessingBuilder {
    private StringBuilder builder;

    // Constructor to initialize StringBuilder
    public TextProcessingBuilder(String text) {
        builder = new StringBuilder(text);
    }

    // Method to append text
    public void appendText(String text) {
        builder.append(text);
    }

    // Method to display the string
    public void display() {
        System.out.println("Modified String: " + builder.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create initial string
        System.out.print("Enter initial text: ");
        String input = sc.nextLine();

        TextProcessingBuilder tpb = new TextProcessingBuilder(input);

        // Append additional text
        System.out.print("Enter text to append: ");
        String appendText = sc.nextLine();
        tpb.appendText(appendText);

        // Display modified string
        tpb.display();

        sc.close();
    }
}
