// Define a class TextEditorBuffer.
//  Create a string using StringBuffer.
//  Append text to the string.
//  Insert text at a specific position.
//  Reverse the final string and display it.
import java.util.Scanner;

class TextEditorBuffer {
    private StringBuffer buffer;

    // Constructor to initialize StringBuffer
    public TextEditorBuffer(String text) {
        buffer = new StringBuffer(text);
    }

    // Method to append text
    public void appendText(String text) {
        buffer.append(text);
    }

    // Method to insert text at a specific position
    public void insertText(int position, String text) {
        if (position >= 0 && position <= buffer.length()) {
            buffer.insert(position, text);
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Method to reverse the string
    public void reverseText() {
        buffer.reverse();
    }

    // Method to display the string
    public void display() {
        System.out.println("Current Text: " + buffer.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create initial string
        System.out.print("Enter initial text: ");
        String input = sc.nextLine();

        TextEditorBuffer teb = new TextEditorBuffer(input);

        // Append text
        System.out.print("Enter text to append: ");
        String appendText = sc.nextLine();
        teb.appendText(appendText);
        teb.display();

        // Insert text
        System.out.print("Enter position to insert text: ");
        int pos = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();
        teb.insertText(pos, insertText);
        teb.display();

        // Reverse final string
        teb.reverseText();
        System.out.println("Reversed Text: ");
        teb.display();

        sc.close();
    }
}