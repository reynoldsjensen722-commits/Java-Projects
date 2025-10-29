package chapter_2;

import java.util.Scanner;
public class Exercise2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualRate = input.nextDouble() / 100.0;

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double futureValue = investment * Math.pow(1 + annualRate / 12.0, years * 12.0);
        System.out.println("Future value is " + futureValue);

        input.close();
    }
}