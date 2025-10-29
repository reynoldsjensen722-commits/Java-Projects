package chapter_3;
import java.util.Scanner;

public class Palindrome3Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit integer: ");
        int number = input.nextInt();

        int first = number / 100;
        int last  = number % 10;

        if (first == last)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");

        input.close();
    }
}

