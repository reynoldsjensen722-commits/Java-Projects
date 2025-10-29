package chapter_5;
import java.util.Scanner;

public class GuessNumberLoop {
    // Keep guessing until correct; show hint each time
    public static void main(String[] args) {
        int target = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess, tries = 0;

        do {
            System.out.print("Guess 0..100: ");
            guess = input.nextInt();
            tries++;
            if (guess < target) System.out.println("Too low.");
            else if (guess > target) System.out.println("Too high.");
        } while (guess != target);

        System.out.println("Correct in " + tries + " tries.");
        input.close();
    }
}
