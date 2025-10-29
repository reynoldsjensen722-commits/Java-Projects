package chapter_4;
import java.util.Scanner;

public class ISBNGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN (leading zeros allowed): ");
        String isbn = input.next();

        if (isbn.length() != 9 || !isbn.matches("\\d{9}")) {
            System.out.println("Invalid input. Please enter exactly 9 digits.");
            input.close();
            return;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += digit * (i + 1);
        }

        int checksum = sum % 11;
        String checkDigit = (checksum == 10) ? "X" : String.valueOf(checksum);

        System.out.println("The 10-digit ISBN is: " + isbn + checkDigit);
        input.close();
    }
}

