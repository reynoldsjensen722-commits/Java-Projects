package chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise12_25 {
    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");

        double totalAssistant = 0, totalAssociate = 0, totalFull = 0;
        int countAssistant = 0, countAssociate = 0, countFull = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                input.next(); // FirstName
                input.next(); // LastName
                String rank = input.next();
                double salary = input.nextDouble();

                switch (rank) {
                    case "assistant" -> {
                        totalAssistant += salary;
                        countAssistant++;
                    }
                    case "associate" -> {
                        totalAssociate += salary;
                        countAssociate++;
                    }
                    case "full" -> {
                        totalFull += salary;
                        countFull++;
                    }
                }
            }
        }

        double grandTotal = totalAssistant + totalAssociate + totalFull;
        int grandCount = countAssistant + countAssociate + countFull;

        System.out.printf("Assistant - Total: %.2f | Avg: %.2f\n", totalAssistant, totalAssistant / countAssistant);
        System.out.printf("Associate - Total: %.2f | Avg: %.2f\n", totalAssociate, totalAssociate / countAssociate);
        System.out.printf("Full - Total: %.2f | Avg: %.2f\n", totalFull, totalFull / countFull);
        System.out.printf("Overall - Total: %.2f | Avg: %.2f\n", grandTotal, grandTotal / grandCount);
    }
}

