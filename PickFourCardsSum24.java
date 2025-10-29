package chapter_7;

import java.util.*;

public class PickFourCardsSum24 {

    public static void main(String[] args) {
        String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"
        };

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

       
        
        int attempts = 0;

        while (true) {
            Collections.shuffle(deck);
            List<String> pickedCards = deck.subList(0, 4);
            int sum = 0;

            for (String card : pickedCards) {
                String rank = card.split(" ")[0];
                int value;

                switch (rank) {
                    case "Ace": value = 1; break;
                    case "Jack": value = 11; break;
                    case "Queen": value = 12; break;
                    case "King": value = 13; break;
                    default: value = Integer.parseInt(rank);
                }

                sum += value;
            }

            attempts++;

            if (sum == 24) {
                for (String card : pickedCards) {
                    System.out.println(card);
                }
                System.out.println("Number of picks: " + attempts);
                break;
            }
        }
    }
}

