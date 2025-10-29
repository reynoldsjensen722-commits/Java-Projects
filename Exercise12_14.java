package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a file path containing scores: ");
        String path = console.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File not found: " + path);
            return;
        }

        int count = 0;
        double total = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                if (input.hasNextDouble()) {
                    total += input.nextDouble();
                    count++;
                } else {
                    input.next(); // Skip invalid token
                }
            }

            if (count == 0) {
                System.out.println("No scores found.");
            } else {
                System.out.println("Total: " + total);
                System.out.printf("Average: %.2f\n", total / count);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
