package chapter_5;
import java.util.Scanner;

public class HighestScoreFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = input.nextInt();

        String bestName = "";
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name then score: ");
            String name = input.next();
            int score = input.nextInt();
            if (score > bestScore) {
                bestScore = score;
                bestName = name;
            }
        }
        System.out.println("Top student: " + bestName + " with score " + bestScore);
        input.close();
    }
}
