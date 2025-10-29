package chapter_5;
import java.util.Scanner;

public class RPSLoopGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Rock", "Paper", "Scissors"};

        while (true) {
            int comp = (int)(Math.random() * 3);
            System.out.print("Rock(0), Paper(1), Scissors(2), Exit(9): ");
            int user = input.nextInt();
            if (user == 9) break;
            if (user < 0 || user > 2) { System.out.println("Invalid"); continue; }

            System.out.println("You: " + names[user] + " | Computer: " + names[comp]);
            if (user == comp) System.out.println("Tie.");
            else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1))
                System.out.println("You win.");
            else
                System.out.println("You lose.");
        }
        input.close();
    }
}
