package chapter_12;

public class HexConverter {

    public static int hex2Dec(String hex) {
        // Validate manually
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!Character.isDigit(ch) &&
                !(ch >= 'A' && ch <= 'F') &&
                !(ch >= 'a' && ch <= 'f')) {
                throw new NumberFormatException("Not a hex number: " + hex);
            }
        }

        return Integer.parseInt(hex, 16);
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        try {
            int decimal = hex2Dec(hex);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Not a hex number");
        }
    }
}

