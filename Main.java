import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);


        int x = rand.nextInt(100); // Random number between 0-100
        int guess;
        int count = 1; // Count the number of guesses
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        
        while(guess != x) { // Continue until the guess is correct or 7 tries
            if (guess < x) {
                System.out.println("Too low ROFL!");
            } else if (guess > x) {
                System.out.println("Too high ROFL!");
            }

            guess = scan.nextInt();
            count++; // Increment guess count
        }

        // Outcome messages based on guess count
        if (count <= 7) {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("You got a s†atistically almost impossibe score!");
        } else if (count <= 10) {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("You did a good job!");
        } else {
            System.out.println("You did: " + count + " guesses!");
            System.out.println("Try the divide and conquer strategy next time!");
        }

        scan.close(); // Close the scanners
    }
}
