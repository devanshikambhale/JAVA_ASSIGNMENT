// Create a class WordCounter.
//  Accept a sentence from the user.
//  Use StringTokenizer to count words.

//  Display total number of words.
import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    private String sentence;

    // Constructor to accept sentence
    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    // Method to count words using StringTokenizer
    public int countWords() {
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        return tokenizer.countTokens();
    }

    // Method to display result
    public void displayCount() {
        int count = countWords();
        System.out.println("Total number of words: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept sentence from user
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Create WordCounter object
        WordCounter wc = new WordCounter(input);

        // Display word count
        wc.displayCount();

        sc.close();
    }
}