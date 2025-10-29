package chapter_5;
import java.util.Scanner;

public class GuessNumberOneTime {
    // Guess a random number 0..100 once; say high/low/correct
    public static void main(String[] args) {
        int target = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);

        System.out.print("Guess a number between 0 and 100: ");
        int g = input.nextInt();

        if (g == target) System.out.println("Correct!");
        else if (g < target) System.out.println("Too low. The number was " + target + ".");
        else System.out.println("Too high. The number was " + target + ".");

        input.close();
    }
}
