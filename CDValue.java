package chapter_5;
import java.util.Scanner;

public class CDValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual percentage yield (e.g. 5.75): ");
        double annualYield = input.nextDouble();

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        double monthlyRate = annualYield / 1200;

        System.out.println("Month\tCD Value");
        for (int i = 1; i <= months; i++) {
            amount = amount + amount * monthlyRate;
            System.out.printf("%d\t%.2f%n", i, amount);
        }

        input.close();
    }
}
