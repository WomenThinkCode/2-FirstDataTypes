package org.example;

import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String politician1;
        int votes1;
        String politician2;
        int votes2;
        String politician3;
        int votes3;
        int totalVotes;
        int percent1;
        int percent2;
        int percent3;
        String winner;

        System.out.println("Enter the first politician: ");
        politician1 = input.nextLine();
        System.out.println("How many votes: ");
        votes1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter the second politician: ");
        politician2 = input.nextLine();
        System.out.println("How many votes: ");
        votes2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter the third politician: ");
        politician3 = input.nextLine();
        System.out.println("How many votes: ");
        votes3 = input.nextInt();
        input.nextLine();

        totalVotes = votes1 + votes2 + votes3;

        percent1 = (votes1 * 100) / totalVotes;
        percent2 = (votes2 * 100) / totalVotes;
        percent3 = (votes3 * 100) / totalVotes;

        System.out.println(politician1 + "received " + percent1 + "% of votes");
        System.out.println(politician2 + "received " + percent2 + "% of votes");
        System.out.println(politician3 + "received " + percent3 + "% of votes");

        if (votes1 > votes2 && votes1 > votes3) {
            winner = politician1;
            System.out.println("Winner: " + winner);
        } else if (votes2 > votes1 && votes2 > votes3) {
            winner = politician2;
            System.out.println("Winner: " + winner);
        } else if (votes3 > votes1 && votes3 > votes2) {
            winner = politician3;
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("No clear winner");
        }
        input.close();
    }
}
