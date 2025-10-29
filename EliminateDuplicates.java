package chapter_7;

import java.util.Scanner;

public class EliminateDuplicates {

    /** Eliminate duplicates and return new array */
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = list[i];
                count++;
            }
        }

        // Copy distinct values into final array
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
