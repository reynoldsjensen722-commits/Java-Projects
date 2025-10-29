package chapter_12;

import java.util.Scanner;

public class HexToDecimalCustom {

    public static int hex2Dec(String hex) throws HexFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!Character.isDigit(ch) &&
                !(ch >= 'A' && ch <= 'F') &&
                !(ch >= 'a' && ch <= 'f')) {
                throw new HexFormatException("Invalid character in hex: " + ch);
            }
        }

        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            int decimal = hex2Dec(hex);
            System.out.println("Decimal value: " + decimal);
        } catch (HexFormatException e) {
            System.out.println("Not a hex number");
        }
    }
}

