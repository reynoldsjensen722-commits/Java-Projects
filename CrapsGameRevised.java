package chapter_6;

import java.util.Random;

public class CrapsGameRevised {

    static Random rand = new Random();

    // Roll two dice and return their sum
    public static int rollDice() {
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        return die1 + die2;
    }

    // Simulate one game of Craps, return true if player wins
    public static boolean playGame() {
        int sum = rollDice();

        if (sum == 7 || sum == 11) {
            return true; // NATURAL win
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return false; // CRAPS lose
        } else {
            int point = sum;
            while (true) {
                sum = rollDice();
                if (sum == point) return true; // Win by point
                if (sum == 7) return false;    // Lose by 7
            }
        }
    }

    // Main simulation
    public static void main(String[] args) {
        int wins = 0;
        int totalGames = 10000;

        for (int i = 0; i < totalGames; i++) {
            if (playGame()) {
                wins++;
            }
        }

        System.out.println("Out of " + totalGames + " games, wins: " + wins);
    }
}

