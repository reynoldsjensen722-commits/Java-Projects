package chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeIntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = readInteger(input, "Enter the first integer: ");
        int num2 = readInteger(input, "Enter the second integer: ");

        System.out.println("Sum is: " + (num1 + num2));
    }

    public static int readInteger(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine(); // Clear the invalid input
            }
        }
    }
}

