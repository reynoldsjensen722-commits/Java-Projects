package chapter_6;

/*
 * Author: Jensen Reynolds
 * Class: CS 2
 * Professor: Taylor
 * Date: 
 * Description: 
 */
public class NumberReverser {

    // Method to reverse and print the digits of an integer
    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println(); // Move to next line after printing
    }

    // Test program
    public static void main(String[] args) {
        System.out.print("Reversed number of 3456 is: ");
        reverse(3456); // Expected output: 6543
    }
}

