package chapter_4;
import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        if (decimal >= 0 && decimal <= 15) {
            char hexChar = (decimal < 10) ? (char) ('0' + decimal)
                                          : (char) ('A' + (decimal - 10));
            System.out.println("The hex value is " + hexChar);
        } else {
            System.out.println(decimal + " is an invalid input");
        }

        input.close();
    }
}
