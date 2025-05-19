package org.example;

import java.util.Scanner;
import java.util.Random;

public class RandomGuessMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 5
        int randomNumber = random.nextInt(5) + 1;

        // Ask the user to guess
        System.out.print("Guess a number between 1 and 5: ");
        int userGuess = scanner.nextInt();

        // Check if the guess is correct
        boolean isCorrect = (userGuess == randomNumber);

        // Display result
        System.out.println("Random number was: " + randomNumber);
        System.out.println("Your guess is correct: " + isCorrect);
    }
}
