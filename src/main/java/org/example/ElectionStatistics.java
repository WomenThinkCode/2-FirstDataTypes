package org.example;

import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names and votes
        System.out.print("Enter the name of the first politician: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter votes for " + name1 + ": ");
        int votes1 = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter the name of the second politician: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter votes for " + name2 + ": ");
        int votes2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name of the third politician: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter votes for " + name3 + ": ");
        int votes3 = scanner.nextInt();

        // Calculate total and percentages
        int totalVotes = votes1 + votes2 + votes3;

        double percent1 = (votes1 * 100.0) / totalVotes;
        double percent2 = (votes2 * 100.0) / totalVotes;
        double percent3 = (votes3 * 100.0) / totalVotes;

        // Display results
        System.out.printf("%s received %.2f%% of the votes.\n", name1, percent1);
        System.out.printf("%s received %.2f%% of the votes.\n", name2, percent2);
        System.out.printf("%s received %.2f%% of the votes.\n", name3, percent3);

        // Determine the winner
        String winner;
        if (votes1 > votes2 && votes1 > votes3) {
            winner = name1;
        } else if (votes2 > votes1 && votes2 > votes3) {
            winner = name2;
        } else if (votes3 > votes1 && votes3 > votes2) {
            winner = name3;
        } else {
            winner = "No single winner (It's a tie)";
        }

        // Display winner
        System.out.println("Winner of the election: " + winner);
    }
}

