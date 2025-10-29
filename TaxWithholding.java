package chapter_3;
import java.util.Scanner;

public class TaxWithholding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Employee’s name: ");
        String name = input.nextLine();

        System.out.print("Hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Federal tax withholding rate (e.g., 0.20): ");
        double fedRate = input.nextDouble();

        System.out.print("State tax withholding rate (e.g., 0.09): ");
        double stateRate = input.nextDouble();

        double grossPay = hours * payRate;
        double fed = grossPay * fedRate;
        double state = grossPay * stateRate;
        double totalDeduction = fed + state;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Hours Worked: %.2f%n", hours);
        System.out.printf("Pay Rate: $%.2f%n", payRate);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f%n", fedRate * 100, fed);
        System.out.printf("  State Withholding (%.1f%%): $%.2f%n", stateRate * 100, state);
        System.out.printf("  Total Deduction: $%.2f%n", totalDeduction);
        System.out.printf("Net Pay: $%.2f%n", netPay);

        input.close();
    }
}

