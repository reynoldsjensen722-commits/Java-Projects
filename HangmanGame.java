package chapter_7;

import java.util.*;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] words = { "write", "that", "java", "hangman", "game", "simple" };
        boolean playAgain;

        do {
            String word = words[rand.nextInt(words.length)];
            char[] display = new char[word.length()];
            Arrays.fill(display, '*');
            int misses = 0;
            List<Character> guessed = new ArrayList<>();

            while (!String.valueOf(display).equals(word)) {
                System.out.print("(Guess) Enter a letter in word " + String.valueOf(display) + ": ");
                char guess = input.next().charAt(0);

                if (guessed.contains(guess)) {
                    System.out.println("   " + guess + " is already guessed");
                    continue;
                }

                guessed.add(guess);

                boolean match = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess && display[i] == '*') {
                        display[i] = guess;
                        match = true;
                    }
                }

                if (!match) {
                    System.out.println("   " + guess + " is not in the word");
                    misses++;
                }
            }

            System.out.println("The word is " + word + ". You missed " + misses + " time(s).");

            System.out.print("Do you want to guess another word? Enter y or n > ");
            playAgain = input.next().equalsIgnoreCase("y");

        } while (playAgain);

        input.close();
    }
}

