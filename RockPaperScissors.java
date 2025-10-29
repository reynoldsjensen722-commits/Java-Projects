package chapter_3;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Rock Paper Scissors");
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors");

        System.out.print("Your choice: ");
        int userChoice = input.nextInt();
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice");
            input.close();
            return;
        }

        int computerChoice = rand.nextInt(3);
        System.out.println("Computer chose: " + choiceName(computerChoice));
        System.out.println("You chose: " + choiceName(userChoice));

        if (userChoice == computerChoice) {
            System.out.println("Tie");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        input.close();
    }

    public static String choiceName(int c) {
        return switch (c) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            case 2 -> "Scissors";
            default -> "Unknown";
        };
    }
}
