package chapter_5;
import java.util.Scanner;

public class ReverseStringWords {
    // Reverse an entire string character-by-character and word-by-word
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = input.nextLine();

        StringBuilder chars = new StringBuilder(line).reverse();
        String[] words = line.trim().split("\\s+");
        StringBuilder wordsRev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            wordsRev.append(words[i]);
            if (i > 0) wordsRev.append(' ');
        }

        System.out.println("Chars reversed: " + chars);
        System.out.println("Words reversed: " + wordsRev);
        input.close();
    }
}
