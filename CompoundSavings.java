package chapter_5;
import java.util.Scanner;

public class CompoundSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Monthly saving amount: ");
        double monthly = input.nextDouble();

        System.out.print("Annual interest rate (e.g., 5 for 5%): ");
        double annualRate = input.nextDouble();

        System.out.print("Number of months: ");
        int months = input.nextInt();

        double r = annualRate / 1200.0;
        double balance = 0.0;

        for (int i = 0; i < months; i++) {
            balance = (balance + monthly) * (1 + r);
        }
        System.out.printf("After %d months: $%.2f%n", months, balance);
        input.close();
    }
}
