package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;

public class RandomGuessMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 & 5: ");
        int RandomGuess = scanner.nextInt();

        Random guess = new Random();
        int guess1 = guess.nextInt(5);

        System.out.println("Your guess: "+RandomGuess);
        System.out.println("Computer's guess: "+guess1);

        if (RandomGuess == guess1 || C)
//        int guess2 = guess.nextInt(5);
    }
}
