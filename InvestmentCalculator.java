package chapter_6;

import java.util.Scanner;

public class InvestmentCalculator {

    // Method to compute future investment value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualRate = input.nextDouble();

        double monthlyRate = annualRate / 100 / 12;

        // Print table header
        System.out.println("\nYears\tFuture Value");
        System.out.println("------------------------");

        // Loop through 1 to 30 years and print future value
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(investment, monthlyRate, year);
            System.out.printf("%d\t%.2f\n", year, futureValue);
        }

        input.close();
    }
}

