package org.example;
import java.util.Random;
import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int computerNumber = random.nextInt(1, 6);

        System.out.println("Enter your guess between 1 and 5: ");
        int guess = input.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The computer number is: " + computerNumber);

        if(guess == computerNumber) {
            System.out.println("Your guess is correct");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}
