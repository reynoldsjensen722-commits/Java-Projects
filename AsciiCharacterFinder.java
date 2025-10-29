package chapter_4;
import java.util.Scanner;

public class AsciiCharacterFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        if (code >= 0 && code <= 127) {
            char character = (char) code;
            System.out.println("The character for ASCII code " + code + " is " + character);
        } else {
            System.out.println("Invalid input! Please enter a number between 0 and 127.");
        }

        input.close();
    }
}
