package chapter_6;

import java.util.Scanner;

public class Hex2Dec {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));

        input.close(); // Good practice to close input stream
    }

    /** Convert hex string to decimal */
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    /** Convert a hex char to its decimal equivalent */
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            // ch is '0' to '9'
            return ch - '0';
        }
    }
}
