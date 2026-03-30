// Number Guessing Game: User guesses a randomly generated number within a 
// range. This game generates a random number, and the player attempts to guess it within 
// a set range (e.g., 1–100). After each guess, the program tells the player if their guess is 
// too high, too low, or correct. 
import java.util.Random; 
import java.util.Scanner; 
 
public class NumberGuessingGame { 
    public static void main(String[] args) { 
 
        Random random = new Random(); 
        Scanner sc = new Scanner(System.in); 
 
        int number = random.nextInt(100) + 1; 
 
        System.out.println("Number Guessing Game"); 
        System.out.println("Guess a number between 1 and 100"); 
 
        while (true) { 
            System.out.print("Enter your guess: "); 
            int guess = sc.nextInt(); 
 
            if (guess < number) { 
                System.out.println("Too Low"); 
            }  
            else if (guess > number) { 
                System.out.println("Too High"); 
            }  
            else { 
                System.out.println("Correct!"); 
                break; 
            } 
        } 
 
        sc.close(); 
    } 
}
