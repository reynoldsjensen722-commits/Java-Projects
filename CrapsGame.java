package chapter_6;

import java.util.Random;

public class CrapsGame {

    static Random rand = new Random();

    // Roll two dice and return the sum
    public static int rollDice() {
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        int sum = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    // Main game logic
    public static void main(String[] args) {
        int sum = rollDice();

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("CRAPS! You lose.");
        } else if (sum == 7 || sum == 11) {
            System.out.println("NATURAL! You win!");
        } else {
            int point = sum;
            System.out.println("Point is set to " + point);

            // Keep rolling until win or lose
            while (true) {
                sum = rollDice();

                if (sum == point) {
                    System.out.println("You rolled your point! You win!");
                    break;
                } else if (sum == 7) {
                    System.out.println("You rolled a 7! You lose.");
                    break;
                }
            }
        }
    }
}

