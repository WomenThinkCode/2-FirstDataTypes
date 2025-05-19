package org.example;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        //initializing fields
        int minutes;
        int hours;
        int days;

        //taking in the minutes as an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes you wish to convert: ");
        minutes = input.nextInt();

        //conversions
        hours = minutes / 60;
        days = hours / 24;

        //displaying the output
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.print("Days: " + days);

    }
}
