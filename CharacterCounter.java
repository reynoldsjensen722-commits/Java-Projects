package chapter_6;

import java.util.Scanner;

public class CharacterCounter {

    // Method to count occurrences of character 'a' in string 'str'
    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Prompt for character
        System.out.print("Enter a character to count: ");
        char targetChar = input.next().charAt(0);

        // Count and display
        int result = count(userInput, targetChar);
        System.out.println("The character '" + targetChar + "' appears " + result + " time(s).");

        input.close();
    }
}

