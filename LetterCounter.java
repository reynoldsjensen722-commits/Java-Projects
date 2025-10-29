package chapter_6;

import java.util.Scanner;

public class LetterCounter {

    // Method to count only letters in a string
    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        int letterCount = countLetters(userInput);

        System.out.println("Number of letters: " + letterCount);

        input.close();
    }
}

