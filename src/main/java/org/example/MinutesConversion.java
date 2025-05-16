package org.example;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number here: ");
        double MinutesToHours = scn.nextInt()/ 60;
        double HoursToDays = MinutesToHours / 24;

        System.out.println("Minutes To Hours:   " + MinutesToHours);
        System.out.println("Hours To Days:  " + HoursToDays);
    }
}
