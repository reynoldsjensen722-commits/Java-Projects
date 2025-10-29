package chapter_4;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        String lottery = generateLottery();
        String guess = getUserGuess();

        System.out.println("The lottery number is " + lottery);
        checkGuess(lottery, guess);
    }

    public static String generateLottery() {
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        return "" + digit1 + digit2;
    }

    public static String getUserGuess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();
        input.close();
        return guess;
    }

    public static void checkGuess(String lottery, String guess) {
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                   guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
