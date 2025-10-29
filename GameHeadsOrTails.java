package chapter_3;
import java.util.Scanner;

public class GameHeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flip = (int)(Math.random() * 2); // 0 heads, 1 tails

        System.out.print("Guess the coin flip (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        if (guess != 0 && guess != 1)
            System.out.println("Invalid guess.");
        else if (guess == flip)
            System.out.println("Correct! It was " + (flip == 0 ? "heads" : "tails"));
        else
            System.out.println("Wrong! It was " + (flip == 0 ? "heads" : "tails"));

        input.close();
    }
}

