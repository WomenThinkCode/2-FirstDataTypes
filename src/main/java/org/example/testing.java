package org.example;

import java.util.Scanner;

public class testing
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age>> ");
        age = input.nextInt();
        input.nextLine(); // solution
        System.out.println("Enter you name>> ");
        name = input.nextLine();
        System.out.println("Your name is " + name);
        if (age>=18) {
            System.out.print("You are an adult and you are "+ age + " years old.");
        } else {
            System.out.print("Only "+ age +"? You are still a child!");
        }
    }
}