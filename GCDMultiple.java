package chapter_7;

import java.util.Scanner;

public class GCDMultiple {

    // GCD for variable number of integers
    public static int gcd(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    // GCD for two numbers using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            values[i] = input.nextInt();
        }

        int result = gcd(values);
        System.out.println("The GCD is: " + result);

        input.close();
    }
}
