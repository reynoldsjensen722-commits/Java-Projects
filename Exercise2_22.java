package chapter_2;

import java.util.Scanner;

public class Exercise2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount as an integer, e.g., 1156 for $11.56: ");
        int amount = input.nextInt();

        int remaining = amount;

        int dollars = remaining / 100;
        remaining %= 100;

        int quarters = remaining / 25;
        remaining %= 25;

        int dimes = remaining / 10;
        remaining %= 10;

        int nickels = remaining / 5;
        remaining %= 5;

        int pennies = remaining;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickels + " nickels");
        System.out.println(" " + pennies + " pennies");

        input.close();
    }
}
