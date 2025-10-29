package chapter_7;

import java.util.Scanner;

public class ReverseArray {

    /** Reverse array by returning a new reversed array */
    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] reversed = reverse(numbers);

        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

