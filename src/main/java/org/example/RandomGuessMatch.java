package org.example;

import java.util.Random;
import java.util.Scanner;

public class RandomGuessMatch {

    public static int generateNumber() {
        Random rand = new Random();
        return 1 + rand.nextInt(5);
    }

    public static boolean checkGuess(int correctNum, int guess) {
        return (correctNum == guess);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int correctNum = generateNumber();
        boolean validInput = false;
        int guess = 0;

        System.out.println("Please enter a number between 1 and 5: ");

        while (!validInput) {
            try{
                guess = scan.nextInt();
                if (!(guess > 0 && guess < 6)) {
                    System.out.println("Number must be between 1 and 5. Try again: ");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1 and 5: ");
                scan.next();
            }
        }

        boolean checkGuess = checkGuess(correctNum, guess);

        if (checkGuess) {
            System.out.println("You correctly guessed the number!");
        } else {
            System.out.println("The correct number is: " + correctNum);
            System.out.println("You lost the game!");
        }
    scan.close();

    }
}
