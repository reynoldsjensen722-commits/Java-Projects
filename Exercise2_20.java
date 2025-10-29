package chapter_2;

import java.util.Scanner;

public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualRatePercent = input.nextDouble();

        double monthlyInterest = balance * (annualRatePercent / 1200.0);
        System.out.println("The interest is " + monthlyInterest);

        input.close();
    }
}