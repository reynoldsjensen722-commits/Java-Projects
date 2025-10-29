package chapter_7;

import java.util.*;

public class CouponCollectorDeck {
    public static void main(String[] args) {
        String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"
        };

        boolean[] suitCollected = new boolean[4]; // 1 per suit
        String[] cardsPicked = new String[4];     // store 1 card per suit
        int collected = 0;
        int pickCount = 0;
        Random rand = new Random();

        while (collected < 4) {
            int suitIndex = rand.nextInt(4);
            int rankIndex = rand.nextInt(13);
            String card = ranks[rankIndex] + " of " + suits[suitIndex];
            pickCount++;

            if (!suitCollected[suitIndex]) {
                suitCollected[suitIndex] = true;
                cardsPicked[suitIndex] = card;
            }

            // Optional: Print all picks
            // System.out.println(card);
        }

        // Output final result
        for (String card : cardsPicked) {
            System.out.println(card);
        }

        System.out.println("Number of picks: " + pickCount);
    }
}

