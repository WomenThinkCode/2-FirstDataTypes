package exercises;
 import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int min;
            int hours;
            int days;

            System.out.println("Enter the minutes: ");
            min = input.nextInt();

            hours = min / 60;
            System.out.println(" hours : " + hours);

            days = min / 1440;
            System.out.println(" days: " + days);
        }
    }










