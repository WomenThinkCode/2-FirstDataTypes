package exercises;
import java.util.Scanner;
import java.util.Random;

public class RandomGuessMatch {
    public static void main (String [] args){

        int guess;

        int randomNumber = (int)(Math.random() * 5) + 1;

            Scanner scanner = new Scanner(System.in);
            System.out.println("guess a number between 1 -5 ");
            guess  = scanner.nextInt();

           System.out.println(guess == randomNumber);

            // Output the result
            System.out.println("Random number was: " + randomNumber);
            System.out.println("Your guess was: " + guess);

    }
}





