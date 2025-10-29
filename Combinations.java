package chapter_7;

import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("All combinations of picking two numbers:");

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }

        input.close();
    }
}
