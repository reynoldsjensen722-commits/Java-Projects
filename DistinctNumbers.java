package chapter_7;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] distinct = new int[10]; // max 10 distinct possible
        int count = 0;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean isNew = true;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == distinct[j]) {
                    isNew = false;
                    break;
                }
            }

            if (isNew) {
                distinct[count] = numbers[i];
                count++;
            }
        }

        // Output
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }

        input.close();
    }
}
