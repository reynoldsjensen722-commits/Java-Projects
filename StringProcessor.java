package chapter_4;
import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (userInput.length() > 0) {
            int length = userInput.length();
            char firstChar = userInput.charAt(0);
            System.out.println("The length of the string is " + length);
            System.out.println("The first character is " + firstChar);
        } else {
            System.out.println("The string is empty.");
        }

        input.close();
    }
}

