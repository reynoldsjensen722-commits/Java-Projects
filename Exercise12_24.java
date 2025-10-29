package chapter_12;

import java.io.PrintWriter;
import java.util.Random;

public class Exercise12_24 {
    public static void main(String[] args) throws Exception {
        String[] ranks = {"assistant", "associate", "full"};
        Random rand = new Random();

        try (PrintWriter output = new PrintWriter("Salary.txt")) {
            for (int i = 1; i <= 1000; i++) {
                String first = "FirstName" + i;
                String last = "LastName" + i;
                String rank = ranks[rand.nextInt(3)];
                double salary = switch (rank) {
                    case "assistant" -> 50000 + rand.nextDouble() * 30000;
                    case "associate" -> 60000 + rand.nextDouble() * 50000;
                    case "full" -> 75000 + rand.nextDouble() * 55000;
                    default -> 0;
                };
                output.printf("%s %s %s %.2f\n", first, last, rank, salary);
            }
        }

        System.out.println("Dataset 'Salary.txt' created.");
    }
}

