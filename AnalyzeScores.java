package chapter_7;

import java.util.Scanner;

public class AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX_SCORES = 100;
        int[] scores = new int[MAX_SCORES];
        int count = 0;

        System.out.println("Enter scores (negative number to end):");

        // Step 1: Input scores
        while (count < MAX_SCORES) {
            int score = input.nextInt();
            if (score < 0) {
                break;
            }
            scores[count] = score;
            count++;
        }

        // Step 2: Calculate average
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }

        double average = count > 0 ? (double) sum / count : 0;

        // Step 3: Count above/equal and below average
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Step 4: Output results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores ≥ average: " + aboveOrEqual);
        System.out.println("Number of scores < average: " + below);

        input.close();
    }
}

