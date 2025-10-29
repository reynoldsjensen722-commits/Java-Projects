package chapter_3;
import java.util.Scanner;

public class FinancialCompareCDs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CD1 rate (as %): ");
        double r1 = input.nextDouble();

        System.out.print("Enter CD2 rate (as %): ");
        double r2 = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double future1 = Math.pow(1 + r1 / 100.0, years);
        double future2 = Math.pow(1 + r2 / 100.0, years);

        if (future1 > future2)
            System.out.println("CD1 yields more over " + years + " years.");
        else if (future2 > future1)
            System.out.println("CD2 yields more over " + years + " years.");
        else
            System.out.println("Both CDs yield the same amount.");

        input.close();
    }
}

