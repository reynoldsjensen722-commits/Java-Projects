package chapter_12;

import java.util.Scanner;

public class BinaryToDecimalCustom {

    public static int bin2Dec(String binary) throws BinaryFormatException {
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid character in binary: " + ch);
            }
        }
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        try {
            int decimal = bin2Dec(binary);
            System.out.println("Decimal value: " + decimal);
        } catch (BinaryFormatException e) {
            System.out.println("Not a binary number");
        }
    }
}

