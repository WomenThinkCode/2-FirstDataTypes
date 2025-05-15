
import java.util.Random;
import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

       boolean isCorrect = (guess == randomNumber);
       System.out.println("Is your guess of " + guess + " correct? " + isCorrect);

        input.close();
    }
}
