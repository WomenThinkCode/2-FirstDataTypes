package org.example;
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes;
        int hours;
        int days;

        System.out.println("Enter the minutes: ");
        minutes = scanner.nextInt();

        hours= minutes/60;
        days = hours/24;
        System.out.println("Hours: "+ hours);
        System.out.println("Day/s: " + days);
    }
}
