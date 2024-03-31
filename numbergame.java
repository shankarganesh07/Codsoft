package Operator;
import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                correctGuess = true;
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                System.out.println("Total attempts: " + attempts);
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        // Option for multiple rounds
        System.out.print("Play again? (yes/no): ");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            main(args); // Recursive call to start a new round
        } else {
            System.out.println("Thanks for playing! Goodbye.");
        }

        scanner.close();
    }
}