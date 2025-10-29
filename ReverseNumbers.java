package chapter_7;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 10;
        int[] numbers = new int[SIZE];

        // Step 1: Read 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = input.nextInt();
        }

        // Step 2: Display in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}

