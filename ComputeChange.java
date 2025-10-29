package chapter_4;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in format (e.g., 11.56): ");
        String amountStr = input.next();

        int dotIndex = amountStr.indexOf('.');

        String dollarPart = amountStr.substring(0, dotIndex);
        String centPart = amountStr.substring(dotIndex + 1);

        if (centPart.length() == 1) {
            centPart += "0";
        } else if (centPart.length() > 2) {
            centPart = centPart.substring(0, 2);
        }

        int dollars = Integer.parseInt(dollarPart);
        int cents = Integer.parseInt(centPart);

        int quarters = cents / 25; cents %= 25;
        int dimes = cents / 10;    cents %= 10;
        int nickels = cents / 5;   cents %= 5;
        int pennies = cents;

        System.out.println("Your amount $" + amountStr + " consists of:");
        if (dollars > 0) System.out.println(" " + dollars + " " + (dollars == 1 ? "dollar" : "dollars"));
        if (quarters > 0) System.out.println(" " + quarters + " " + (quarters == 1 ? "quarter" : "quarters"));
        if (dimes > 0) System.out.println(" " + dimes + " " + (dimes == 1 ? "dime" : "dimes"));
        if (nickels > 0) System.out.println(" " + nickels + " " + (nickels == 1 ? "nickel" : "nickels"));
        if (pennies > 0) System.out.println(" " + pennies + " " + (pennies == 1 ? "penny" : "pennies"));


        input.close();
    }
}
