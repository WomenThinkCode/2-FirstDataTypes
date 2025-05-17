package exercises;
import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String politician1, politician2, politician3;
        int vote1, vote2, vote3;
        int total;
        double percentage1, percentage2, percentage3;

        // Politician 1
        System.out.println("Name of politician 1:");
        politician1 = scanner.nextLine();
        System.out.println("Number of votes:");
        vote1 = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Politician 2
        System.out.println("Name of politician 2:");
        politician2 = scanner.nextLine();
        System.out.println("Number of votes:");
        vote2 = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Politician 3
        System.out.println("Name of politician 3:");
        politician3 = scanner.nextLine();
        System.out.println("Number of votes:");
        vote3 = scanner.nextInt();

        // Calculations
        total = vote1 + vote2 + vote3;
        percentage1 = (vote1 * 100.0) / total;
        percentage2 = (vote2 * 100.0) / total;
        percentage3 = (vote3 * 100.0) / total;

        // Output
        System.out.println("\nElection Results:");
        System.out.println(politician1 + ": " + percentage1 + "%");
        System.out.println(politician2 + ": " + percentage2 + "%");
        System.out.println(politician3 + ": " + percentage3 + "%");

        // Determine and display winner
        if (vote1 > vote2 && vote1 > vote3) {
            System.out.println("Winner: " + politician1);
        } else if (vote2 > vote1 && vote2 > vote3) {
            System.out.println("Winner: " + politician2);
        } else if (vote3 > vote1 && vote3 > vote2) {
            System.out.println("Winner: " + politician3);
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}

