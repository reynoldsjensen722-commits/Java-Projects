package chapter_5;
import java.util.Scanner;

public class RPSGame {
    // Single-round Rock–Paper–Scissors
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Rock","Paper","Scissors"};

        int comp = (int)(Math.random() * 3);
        System.out.print("Enter 0=Rock, 1=Paper, 2=Scissors: ");
        int user = input.nextInt();

        if (user < 0 || user > 2) {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }
        System.out.println("You: " + names[user] + " | Computer: " + names[comp]);

        if (user == comp) System.out.println("Tie.");
        else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1))
            System.out.println("You win.");
        else
            System.out.println("You lose.");

        input.close();
    }
}
