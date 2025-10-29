package chapter_3;
import java.util.Scanner;

public class CoinFlipGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int)(Math.random() * 2); // 0 heads 1 tails
        System.out.print("Guess the coin flip. Enter 0 for heads or 1 for tails: ");
        int guess = input.nextInt();

        if (guess != 0 && guess != 1) {
            System.out.println("Invalid input. Enter 0 or 1.");
            input.close();
            return;
        }

        String result = (coin == 0) ? "Heads" : "Tails";
        if (guess == coin) {
            System.out.println("Correct. It was " + result + ".");
        } else {
            System.out.println("Wrong. It was " + result + ".");
        }

        input.close();
    }
}
