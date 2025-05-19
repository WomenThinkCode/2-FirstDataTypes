package org.example;

import java.util.Scanner;

public class MinutesConversion {

    public static void minutesConversion(int minutes) {
        double Final_minutes = 0;
        int hours = 0;
        int days = 0;

        while (minutes > 0){
            minutes = minutes - 60;
            if (hours < 24){
                hours++;
            } else {
                hours = 0;
                days++;
            }

            if (minutes < 60){
                Final_minutes = minutes;
                minutes = 0;
            }
        }

        System.out.println("\nThe minutes converted are: ");
        System.out.printf(days + " days : " + hours + " hours : " + (int) Final_minutes + " minutes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minutes to be converted to hours and days : ");
        int minutes = scanner.nextInt();

        minutesConversion(minutes);
    }
}
