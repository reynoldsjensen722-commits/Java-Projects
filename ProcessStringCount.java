package chapter_5;
import java.util.Scanner;

public class ProcessStringCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int letters = 0, digits = 0, spaces = 0, others = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isWhitespace(c)) spaces++;
            else others++;
        }
        System.out.printf("letters=%d, digits=%d, spaces=%d, others=%d%n", letters, digits, spaces, others);
        input.close();
    }
}
