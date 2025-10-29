package chapter_3;
import java.util.Scanner;

public class ComputeTaxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your filing status (0-single filer, 1-married jointly, 2-married separately, 3-head of household): ");
        int status = input.nextInt();

        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                      (income - 33950) * 0.25;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                      (82250 - 33950) * 0.25 +
                      (income - 82250) * 0.28;
        } else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                      (income - 67900) * 0.25;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                      (137050 - 67900) * 0.25 +
                      (income - 137050) * 0.28;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);

        input.close();
    }
}
