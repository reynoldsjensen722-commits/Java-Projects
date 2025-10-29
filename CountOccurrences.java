package chapter_7;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] count = new int[101]; // Index 1 to 100

        System.out.println("Enter the integers between 1 and 100 (end with 0):");

        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }

            if (number >= 1 && number <= 100) {
                count[number]++;
            }
        }

        // Display results
        for (int i = 1; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " time" + (count[i] > 1 ? "s" : ""));
            }
        }

        input.close();
    }
}

