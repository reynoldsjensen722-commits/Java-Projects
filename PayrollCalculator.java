package chapter_4;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hours * payRate;
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Hours Worked: %.1f%n", hours);
        System.out.printf("Pay Rate: $%.2f%n", payRate);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f%n", federalTaxRate * 100, federalWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f%n", stateTaxRate * 100, stateWithholding);
        System.out.printf("Total Deduction: $%.2f%n", totalDeduction);
        System.out.printf("Net Pay: $%.2f%n", netPay);

        input.close();
    }
}
