package chapter_12;

import java.util.Scanner;

public class RandomArrayAccess {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        // Fill array with random integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index (0-99): ");
        int index = input.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}

