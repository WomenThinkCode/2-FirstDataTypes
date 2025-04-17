package org.example;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutes;
        int hours;
        int days;

        System.out.println("Enter the minutes: ");
        minutes = input.nextInt();

        hours = minutes / 60;
        System.out.println("The hours is: " + hours);

        days = minutes / 1440;
        System.out.println("The days is: " + days);
    }
}
