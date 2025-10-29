package chapter_6;

import java.util.Scanner;

public class SortThreeNumbers {

    // Method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // Sort using simple swapping
        if (num1 > num2) {
            temp = num1; num1 = num2; num2 = temp;
        }
        if (num2 > num3) {
            temp = num2; num2 = num3; num3 = temp;
        }
        if (num1 > num2) {
            temp = num1; num1 = num2; num2 = temp;
        }

        System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        displaySortedNumbers(n1, n2, n3);
        input.close();
    }
}

