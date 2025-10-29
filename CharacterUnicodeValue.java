package chapter_3;
import java.util.Scanner;

public class CharacterUnicodeValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The Unicode for character " + ch + " is " + (int) ch);
        input.close();
    }
}
