package chapter_12;

import java.io.*;
import java.util.*;

public class Exercise12_17 {
    public static void main(String[] args) throws IOException {
        File file = new File("hangman.txt");
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        List<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                words.add(input.next());
            }
        }

        // Pick random word
        String word = words.get(new Random().nextInt(words.size()));
        playHangman(word);
    }

    public static void playHangman(String word) {
        Scanner input = new Scanner(System.in);
        char[] guess = new char[word.length()];
        Arrays.fill(guess, '*');
        int misses = 0;

        while (!String.valueOf(guess).equals(word)) {
            System.out.print("(Guess) Enter a letter in word " + String.valueOf(guess) + ": ");
            char ch = input.next().charAt(0);

            if (String.valueOf(guess).contains(String.valueOf(ch))) {
                System.out.println("    " + ch + " is already in the word");
            } else if (word.contains(String.valueOf(ch))) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == ch) guess[i] = ch;
                }
            } else {
                System.out.println("    " + ch + " is not in the word");
                misses++;
            }
        }

        System.out.println("The word is " + word + ". You missed " + misses + " times.");
    }
}

