package chapter_12;

public class BinaryConverter {

    public static int bin2Dec(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new NumberFormatException("Invalid binary: " + binary);
            }
        }
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            int decimal = bin2Dec(binary);
            System.out.println("Decimal value: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Not a binary number");
        }
    }
}


