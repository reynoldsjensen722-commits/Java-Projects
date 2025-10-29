package chapter_8;

import java.util.Scanner;

public class ComputeTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tax rates
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Brackets for each filing status
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},    // 0 - single
            {16700, 67900, 137050, 208850, 372950},  // 1 - married joint
            {8350, 33950, 68525, 104425, 186475},    // 2 - married separate
            {11950, 45500, 117450, 190200, 372950}   // 3 - head of household
            
        };

        // Input status and income
        System.out.print("Enter the filing status (0-3): ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Calculate tax
        double tax = 0;
        int[] bracket = brackets[status];

        if (income <= bracket[0])
            tax = income * rates[0];
        else {
            tax = bracket[0] * rates[0];

            for (int i = 1; i < bracket.length; i++) {
                if (income > bracket[i]) {
                    tax += (bracket[i] - bracket[i - 1]) * rates[i];
                } else {
                    tax += (income - bracket[i - 1]) * rates[i];
                    System.out.printf("Tax is: $%.2f\n", tax);
                    return;
                   
                }
                input.close();
            }

            tax += (income - bracket[4]) * rates[5];
        }

        System.out.printf("Tax is: $%.2f\n", tax);
        
    }
}

