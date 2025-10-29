package chapter_6;

import java.util.Scanner;

public class FormatInteger {

    // Format method to pad number with leading 0s up to 'width'
    public static String format(int number, int width) {
        String numStr = Integer.toString(number);

        int zerosNeeded = width - numStr.length();

        if (zerosNeeded > 0) {
            StringBuilder padded = new StringBuilder();
            for (int i = 0; i < zerosNeeded; i++) {
                padded.append("0");
            }
            padded.append(numStr);
            return padded.toString();
        } else {
            return numStr;
        }
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        String formatted = format(number, width);
        System.out.println("Formatted number: " + formatted);

        input.close();
    }
}

