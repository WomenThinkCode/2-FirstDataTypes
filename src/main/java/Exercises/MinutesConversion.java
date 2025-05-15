package Exercises;

import java.util.Scanner;

public class MinutesConversion{
    public static void main (String[] args){
        Scanner input =  new Scanner (System.in);

       System.out.print("Enter your age >>");

    int age = input.nextInt();

        String ageStr = String.valueOf(age);

        System.out.println(ageStr);

        input.close();
   }
}

