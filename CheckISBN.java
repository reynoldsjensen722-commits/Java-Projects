package chapter_5;
import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn = input.next();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (isbn.charAt(i) - '0') * (i + 1);
        }

        int checksum = sum % 11;
        String fullISBN = isbn + (checksum == 10 ? "X" : checksum);
        System.out.println("The ISBN-10 number is " + fullISBN);

        input.close();
    }
}

