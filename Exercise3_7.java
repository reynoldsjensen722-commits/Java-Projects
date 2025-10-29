package chapter_3;
import java.util.Scanner;

public class Exercise3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount (e.g., 11.56): ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if (dollars > 0) System.out.println(" " + dollars + " dollar(s)");
        if (quarters > 0) System.out.println(" " + quarters + " quarter(s)");
        if (dimes > 0) System.out.println(" " + dimes + " dime(s)");
        if (nickels > 0) System.out.println(" " + nickels + " nickel(s)");
        if (pennies > 0) System.out.println(" " + pennies + " pennie(s)");

        input.close();
    }
}
