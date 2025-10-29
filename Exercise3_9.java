package chapter_3;
import java.util.Scanner;

public class Exercise3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        int remaining = isbn % 100000000;
        int d2 = remaining / 10000000;
        remaining %= 10000000;
        int d3 = remaining / 1000000;
        remaining %= 1000000;
        int d4 = remaining / 100000;
        remaining %= 100000;
        int d5 = remaining / 10000;
        remaining %= 10000;
        int d6 = remaining / 1000;
        remaining %= 1000;
        int d7 = remaining / 100;
        remaining %= 100;
        int d8 = remaining / 10;
        int d9 = remaining % 10;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +
                        d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + isbn);
        if (checksum == 10)
            System.out.println("X");
        else
            System.out.println(checksum);

        input.close();
    }
}
