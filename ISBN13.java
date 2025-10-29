package chapter_5;
import java.util.Scanner;

public class ISBN13 {
    // Given first 12 digits, compute 13th check digit and print full ISBN-13
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13: ");
        String s = input.next();

        if (!s.matches("\\d{12}")) {
            System.out.println("Invalid input: need exactly 12 digits.");
            input.close();
            return;
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int d = s.charAt(i) - '0';
            sum += (i % 2 == 0) ? d : 3 * d;
        }
        int check = (10 - (sum % 10)) % 10;
        System.out.println("Full ISBN-13: " + s + check);
        input.close();
    }
}

